package com.amazonaws.athena.connectors.gcs;

import com.amazonaws.services.athena.AmazonAthenaClientBuilder;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.ServiceAccountCredentials;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class GenericGcsTest
{
    protected MockedStatic<AmazonS3ClientBuilder> mockedS3Builder;
    protected  MockedStatic<AWSSecretsManagerClientBuilder> mockedSecretManagerBuilder;
    protected  MockedStatic<AmazonAthenaClientBuilder> mockedAthenaClientBuilder;
    protected  MockedStatic<GoogleCredentials> mockedGoogleCredentials;
    protected  MockedStatic<GcsUtil> mockedGcsUtil;

    protected MockedStatic<ServiceAccountCredentials> mockedServiceAccountCredentials;

    public void initCommonMockedStatic()
    {
        mockedS3Builder = Mockito.mockStatic(AmazonS3ClientBuilder.class);
        mockedSecretManagerBuilder = Mockito.mockStatic(AWSSecretsManagerClientBuilder.class);
        mockedAthenaClientBuilder = Mockito.mockStatic(AmazonAthenaClientBuilder.class);
        mockedGoogleCredentials = Mockito.mockStatic(GoogleCredentials.class);
        mockedGcsUtil = Mockito.mockStatic(GcsUtil.class);
        mockedServiceAccountCredentials = Mockito.mockStatic(ServiceAccountCredentials.class);
    }

    public void closeMockedObjects() {
        mockedS3Builder.close();
        mockedSecretManagerBuilder.close();
        mockedAthenaClientBuilder.close();
        mockedGoogleCredentials.close();
        mockedGcsUtil.close();
        mockedServiceAccountCredentials.close();
    }
}
