<?php
if (($_FILES['my_file']['name']!="")){
	$target_dir = "../image/books/";
	$file = $_FILES['my_file']['name'];
	$path = pathinfo($file);
	$filename = $path['filename'];
	$ext = $path['extension'];
	$temp_name = $_FILES['my_file']['tmp_name'];
	$path_filename_ext = $target_dir.$filename.".".$ext;
	system('content/image/books/resize.bat');
	echo("The file ". basename( $_FILES["my_file"]["name"]). " has been uploaded and resized <br>");
if (file_exists($path_filename_ext)) {
 echo "Sorry, file already exists.";
 }else{
 move_uploaded_file($temp_name,$path_filename_ext);
 echo "Congratulations! File Uploaded Successfully.";
 }
}
?>
