package kotlin.p481io;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.PrimitiveIterators2;

/* compiled from: IOStreams.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\t\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, m3636d2 = {"kotlin/io/ByteStreamsKt$iterator$1", "Lkotlin/collections/ByteIterator;", "", "prepareNext", "()V", "", "hasNext", "()Z", "", "nextByte", "()B", "", "I", "getNextByte", "()I", "setNextByte", "(I)V", "nextPrepared", "Z", "getNextPrepared", "setNextPrepared", "(Z)V", "finished", "getFinished", "setFinished", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.io.ByteStreamsKt$iterator$1, reason: use source file name */
/* loaded from: classes14.dex */
public final class IOStreams2 extends PrimitiveIterators2 {
    final /* synthetic */ BufferedInputStream $this_iterator;
    private boolean finished;
    private int nextByte;
    private boolean nextPrepared;

    private final void prepareNext() throws IOException {
        if (this.nextPrepared || this.finished) {
            return;
        }
        int i = this.$this_iterator.read();
        this.nextByte = i;
        this.nextPrepared = true;
        this.finished = i == -1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws IOException {
        prepareNext();
        return !this.finished;
    }

    @Override // kotlin.collections.PrimitiveIterators2
    public byte nextByte() throws IOException {
        prepareNext();
        if (this.finished) {
            throw new NoSuchElementException("Input stream is over.");
        }
        byte b = (byte) this.nextByte;
        this.nextPrepared = false;
        return b;
    }
}
