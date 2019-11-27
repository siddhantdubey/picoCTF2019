import tarfile


fname = '991.tar'
x = 0
while(x < 990):
    tar = tarfile.open(fname, "r:")
    tar.extractall()
    tar.close()
    fname = str((991 - x)) + '.tar'
    x  = x + 1