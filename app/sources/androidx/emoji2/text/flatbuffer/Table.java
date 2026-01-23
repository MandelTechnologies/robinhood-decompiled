package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class Table {

    /* renamed from: bb */
    protected ByteBuffer f240bb;
    protected int bb_pos;
    Utf8 utf8 = Utf8.getDefault();
    private int vtable_size;
    private int vtable_start;

    protected int __offset(int i) {
        if (i < this.vtable_size) {
            return this.f240bb.getShort(this.vtable_start + i);
        }
        return 0;
    }

    protected int __indirect(int i) {
        return i + this.f240bb.getInt(i);
    }

    protected int __vector_len(int i) {
        int i2 = i + this.bb_pos;
        return this.f240bb.getInt(i2 + this.f240bb.getInt(i2));
    }

    protected int __vector(int i) {
        int i2 = i + this.bb_pos;
        return i2 + this.f240bb.getInt(i2) + 4;
    }

    protected void __reset(int i, ByteBuffer byteBuffer) {
        this.f240bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i;
            int i2 = i - byteBuffer.getInt(i);
            this.vtable_start = i2;
            this.vtable_size = this.f240bb.getShort(i2);
            return;
        }
        this.bb_pos = 0;
        this.vtable_start = 0;
        this.vtable_size = 0;
    }
}
