package com.singular.sdk.internal;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes12.dex */
public final class QueueFile implements Closeable, Iterable<byte[]> {
    static final int INITIAL_LENGTH = 4096;
    private static final int VERSIONED_HEADER = -2147483647;
    private static final byte[] ZEROES = new byte[4096];
    private final byte[] buffer;
    boolean closed;
    int elementCount;
    final File file;
    long fileLength;
    Element first;
    int headerLength;
    private Element last;
    int modCount = 0;
    final RandomAccessFile raf;
    boolean versioned;
    private final boolean zero;

    /* JADX INFO: Access modifiers changed from: private */
    public static RandomAccessFile initializeFromFile(File file, boolean z) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFileOpen = open(file2);
            try {
                randomAccessFileOpen.setLength(4096L);
                randomAccessFileOpen.seek(0L);
                if (z) {
                    randomAccessFileOpen.writeInt(4096);
                } else {
                    randomAccessFileOpen.writeInt(VERSIONED_HEADER);
                    randomAccessFileOpen.writeLong(4096L);
                }
                randomAccessFileOpen.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFileOpen.close();
                throw th;
            }
        }
        return open(file);
    }

    private static RandomAccessFile open(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    QueueFile(File file, RandomAccessFile randomAccessFile, boolean z, boolean z2) throws IOException {
        long j;
        long j2;
        byte[] bArr = new byte[32];
        this.buffer = bArr;
        this.file = file;
        this.raf = randomAccessFile;
        this.zero = z;
        randomAccessFile.seek(0L);
        randomAccessFile.readFully(bArr);
        boolean z3 = (z2 || (bArr[0] & 128) == 0) ? false : true;
        this.versioned = z3;
        if (z3) {
            this.headerLength = 32;
            int i = readInt(bArr, 0) & Integer.MAX_VALUE;
            if (i != 1) {
                throw new IOException("Unable to read version " + i + " format. Supported versions are 1 and legacy.");
            }
            this.fileLength = readLong(bArr, 4);
            this.elementCount = readInt(bArr, 12);
            j = readLong(bArr, 16);
            j2 = readLong(bArr, 24);
        } else {
            this.headerLength = 16;
            this.fileLength = readInt(bArr, 0);
            this.elementCount = readInt(bArr, 4);
            j = readInt(bArr, 8);
            j2 = readInt(bArr, 12);
        }
        if (this.fileLength > randomAccessFile.length()) {
            throw new IOException("File is truncated. Expected length: " + this.fileLength + ", Actual length: " + randomAccessFile.length());
        }
        if (this.fileLength <= this.headerLength) {
            throw new IOException("File is corrupt; length stored in header (" + this.fileLength + ") is invalid.");
        }
        this.first = readElement(j);
        this.last = readElement(j2);
    }

    private static void writeInt(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static int readInt(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private static void writeLong(byte[] bArr, int i, long j) {
        bArr[i] = (byte) (j >> 56);
        bArr[i + 1] = (byte) (j >> 48);
        bArr[i + 2] = (byte) (j >> 40);
        bArr[i + 3] = (byte) (j >> 32);
        bArr[i + 4] = (byte) (j >> 24);
        bArr[i + 5] = (byte) (j >> 16);
        bArr[i + 6] = (byte) (j >> 8);
        bArr[i + 7] = (byte) j;
    }

    private static long readLong(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 56) + ((bArr[i + 1] & 255) << 48) + ((bArr[i + 2] & 255) << 40) + ((bArr[i + 3] & 255) << 32) + ((bArr[i + 4] & 255) << 24) + ((bArr[i + 5] & 255) << 16) + ((bArr[i + 6] & 255) << 8) + (bArr[i + 7] & 255);
    }

    private void writeHeader(long j, int i, long j2, long j3) throws IOException {
        this.raf.seek(0L);
        if (this.versioned) {
            writeInt(this.buffer, 0, VERSIONED_HEADER);
            writeLong(this.buffer, 4, j);
            writeInt(this.buffer, 12, i);
            writeLong(this.buffer, 16, j2);
            writeLong(this.buffer, 24, j3);
            this.raf.write(this.buffer, 0, 32);
            return;
        }
        writeInt(this.buffer, 0, (int) j);
        writeInt(this.buffer, 4, i);
        writeInt(this.buffer, 8, (int) j2);
        writeInt(this.buffer, 12, (int) j3);
        this.raf.write(this.buffer, 0, 16);
    }

    Element readElement(long j) throws IOException {
        if (j == 0) {
            return Element.NULL;
        }
        ringRead(j, this.buffer, 0, 4);
        return new Element(j, readInt(this.buffer, 0));
    }

    long wrapPosition(long j) {
        long j2 = this.fileLength;
        return j < j2 ? j : (this.headerLength + j) - j2;
    }

    private void ringWrite(long j, byte[] bArr, int i, int i2) throws IOException {
        long jWrapPosition = wrapPosition(j);
        long j2 = i2 + jWrapPosition;
        long j3 = this.fileLength;
        if (j2 <= j3) {
            this.raf.seek(jWrapPosition);
            this.raf.write(bArr, i, i2);
            return;
        }
        int i3 = (int) (j3 - jWrapPosition);
        this.raf.seek(jWrapPosition);
        this.raf.write(bArr, i, i3);
        this.raf.seek(this.headerLength);
        this.raf.write(bArr, i + i3, i2 - i3);
    }

    private void ringErase(long j, long j2) throws IOException {
        long j3 = j;
        while (j2 > 0) {
            byte[] bArr = ZEROES;
            int iMin = (int) Math.min(j2, bArr.length);
            ringWrite(j3, bArr, 0, iMin);
            long j4 = iMin;
            j2 -= j4;
            j3 += j4;
        }
    }

    void ringRead(long j, byte[] bArr, int i, int i2) throws IOException {
        long jWrapPosition = wrapPosition(j);
        long j2 = i2 + jWrapPosition;
        long j3 = this.fileLength;
        if (j2 <= j3) {
            this.raf.seek(jWrapPosition);
            this.raf.readFully(bArr, i, i2);
            return;
        }
        int i3 = (int) (j3 - jWrapPosition);
        this.raf.seek(jWrapPosition);
        this.raf.readFully(bArr, i, i3);
        this.raf.seek(this.headerLength);
        this.raf.readFully(bArr, i + i3, i2 - i3);
    }

    public void add(byte[] bArr) throws IOException {
        add(bArr, 0, bArr.length);
    }

    public void add(byte[] bArr, int i, int i2) throws IOException {
        long jWrapPosition;
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (this.closed) {
            throw new IOException("closed");
        }
        expandIfNecessary(i2);
        boolean zIsEmpty = isEmpty();
        if (zIsEmpty) {
            jWrapPosition = this.headerLength;
        } else {
            jWrapPosition = wrapPosition(this.last.position + 4 + r1.length);
        }
        Element element = new Element(jWrapPosition, i2);
        writeInt(this.buffer, 0, i2);
        ringWrite(element.position, this.buffer, 0, 4);
        ringWrite(element.position + 4, bArr, i, i2);
        writeHeader(this.fileLength, this.elementCount + 1, zIsEmpty ? element.position : this.first.position, element.position);
        this.last = element;
        this.elementCount++;
        this.modCount++;
        if (zIsEmpty) {
            this.first = element;
        }
    }

    private long usedBytes() {
        if (this.elementCount == 0) {
            return this.headerLength;
        }
        long j = this.last.position;
        long j2 = this.first.position;
        if (j >= j2) {
            return (j - j2) + 4 + r0.length + this.headerLength;
        }
        return (((j + 4) + r0.length) + this.fileLength) - j2;
    }

    private long remainingBytes() {
        return this.fileLength - usedBytes();
    }

    public boolean isEmpty() {
        return this.elementCount == 0;
    }

    private void expandIfNecessary(long j) throws IOException {
        long j2;
        long j3;
        long j4 = j + 4;
        long jRemainingBytes = remainingBytes();
        if (jRemainingBytes >= j4) {
            return;
        }
        long j5 = this.fileLength;
        do {
            jRemainingBytes += j5;
            j5 <<= 1;
        } while (jRemainingBytes < j4);
        setLength(j5);
        long jWrapPosition = wrapPosition(this.last.position + 4 + r3.length);
        if (jWrapPosition <= this.first.position) {
            FileChannel channel = this.raf.getChannel();
            channel.position(this.fileLength);
            int i = this.headerLength;
            j2 = jWrapPosition - i;
            if (channel.transferTo(i, j2, channel) != j2) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        } else {
            j2 = 0;
        }
        long j6 = this.last.position;
        long j7 = this.first.position;
        if (j6 < j7) {
            long j8 = (this.fileLength + j6) - this.headerLength;
            writeHeader(j5, this.elementCount, j7, j8);
            this.last = new Element(j8, this.last.length);
            j3 = j5;
        } else {
            writeHeader(j5, this.elementCount, j7, j6);
            j3 = j5;
        }
        this.fileLength = j3;
        if (this.zero) {
            ringErase(this.headerLength, j2);
        }
    }

    private void setLength(long j) throws IOException {
        this.raf.setLength(j);
        this.raf.getChannel().force(true);
    }

    public byte[] peek() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (isEmpty()) {
            return null;
        }
        Element element = this.first;
        int i = element.length;
        if (i > 32768) {
            throw new IOException("QueueFile is probably corrupt, first.length is " + this.first.length);
        }
        byte[] bArr = new byte[i];
        ringRead(4 + element.position, bArr, 0, i);
        return bArr;
    }

    @Override // java.lang.Iterable
    public Iterator<byte[]> iterator() {
        return new ElementIterator();
    }

    private final class ElementIterator implements Iterator<byte[]> {
        int expectedModCount;
        int nextElementIndex = 0;
        private long nextElementPosition;

        ElementIterator() {
            this.nextElementPosition = QueueFile.this.first.position;
            this.expectedModCount = QueueFile.this.modCount;
        }

        private void checkForComodification() {
            if (QueueFile.this.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (QueueFile.this.closed) {
                throw new IllegalStateException("closed");
            }
            checkForComodification();
            return this.nextElementIndex != QueueFile.this.elementCount;
        }

        @Override // java.util.Iterator
        public byte[] next() {
            if (QueueFile.this.closed) {
                throw new IllegalStateException("closed");
            }
            checkForComodification();
            if (QueueFile.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            int i = this.nextElementIndex;
            QueueFile queueFile = QueueFile.this;
            if (i >= queueFile.elementCount) {
                throw new NoSuchElementException();
            }
            try {
                Element element = queueFile.readElement(this.nextElementPosition);
                byte[] bArr = new byte[element.length];
                long jWrapPosition = QueueFile.this.wrapPosition(element.position + 4);
                this.nextElementPosition = jWrapPosition;
                QueueFile.this.ringRead(jWrapPosition, bArr, 0, element.length);
                this.nextElementPosition = QueueFile.this.wrapPosition(element.position + 4 + element.length);
                this.nextElementIndex++;
                return bArr;
            } catch (IOException e) {
                throw new RuntimeException("todo: throw a proper error", e);
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForComodification();
            if (QueueFile.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.nextElementIndex != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                QueueFile.this.remove();
                this.expectedModCount = QueueFile.this.modCount;
                this.nextElementIndex--;
            } catch (IOException e) {
                throw new RuntimeException("todo: throw a proper error", e);
            }
        }
    }

    public int size() {
        return this.elementCount;
    }

    public void remove() throws IOException {
        remove(1);
    }

    public void remove(int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Cannot remove negative (" + i + ") number of elements.");
        }
        if (i == 0) {
            return;
        }
        if (i == this.elementCount) {
            clear();
            return;
        }
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (i > this.elementCount) {
            throw new IllegalArgumentException("Cannot remove more elements (" + i + ") than present in queue (" + this.elementCount + ").");
        }
        Element element = this.first;
        long j = element.position;
        int i2 = element.length;
        long j2 = 0;
        int i3 = 0;
        long j3 = j;
        while (i3 < i) {
            j2 += i2 + 4;
            long jWrapPosition = wrapPosition(j3 + 4 + i2);
            ringRead(jWrapPosition, this.buffer, 0, 4);
            i2 = readInt(this.buffer, 0);
            i3++;
            j3 = jWrapPosition;
        }
        writeHeader(this.fileLength, this.elementCount - i, j3, this.last.position);
        this.elementCount -= i;
        this.modCount++;
        this.first = new Element(j3, i2);
        if (this.zero) {
            ringErase(j, j2);
        }
    }

    public void clear() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        writeHeader(4096L, 0, 0L, 0L);
        if (this.zero) {
            this.raf.seek(this.headerLength);
            this.raf.write(ZEROES, 0, 4096 - this.headerLength);
        }
        this.elementCount = 0;
        Element element = Element.NULL;
        this.first = element;
        this.last = element;
        if (this.fileLength > 4096) {
            setLength(4096L);
        }
        this.fileLength = 4096L;
        this.modCount++;
    }

    public File file() {
        return this.file;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
        this.raf.close();
    }

    public String toString() {
        return QueueFile.class.getSimpleName() + "[length=" + this.fileLength + ", size=" + this.elementCount + ", first=" + this.first + ", last=" + this.last + "]";
    }

    static class Element {
        static final int HEADER_LENGTH = 4;
        static final Element NULL = new Element(0, 0);
        final int length;
        final long position;

        Element(long j, int i) {
            this.position = j;
            this.length = i;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position=" + this.position + ", length=" + this.length + "]";
        }
    }

    public static final class Builder {
        final File file;
        boolean zero = true;
        boolean forceLegacy = false;

        public Builder(File file) {
            if (file == null) {
                throw new NullPointerException("file == null");
            }
            this.file = file;
        }

        public Builder zero(boolean z) {
            this.zero = z;
            return this;
        }

        public Builder forceLegacy(boolean z) {
            this.forceLegacy = z;
            return this;
        }

        public QueueFile build() throws IOException {
            return new QueueFile(this.file, QueueFile.initializeFromFile(this.file, this.forceLegacy), this.zero, this.forceLegacy);
        }
    }
}
