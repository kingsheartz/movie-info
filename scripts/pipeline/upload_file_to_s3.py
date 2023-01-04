import boto3
import sys

def main():
    local_path=sys.argv[1]
    bucket_name=sys.argv[2]

    session = boto3.Session()
    client = session.client('s3')

    response = client.upload_file(
        Filename=local_path,
        Bucket=bucket_name
    )
    print ('Done uploading')


main()