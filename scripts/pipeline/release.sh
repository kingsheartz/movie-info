local_path=$1
bucket_name=$2
aws_key=$3

rm -rf $local_path

pip3 install boto3

python scripts/pipeline/upload_file_to_s3.py $local_path $bucket_name $aws_key