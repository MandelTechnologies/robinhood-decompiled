package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.util.Pack;

/* loaded from: classes25.dex */
public abstract class XMSSAddress {
    private final int keyAndMask;
    private final int layerAddress;
    private final long treeAddress;

    /* renamed from: type, reason: collision with root package name */
    private final int f10855type;

    protected static abstract class Builder<T extends Builder> {

        /* renamed from: type, reason: collision with root package name */
        private final int f10856type;
        private int layerAddress = 0;
        private long treeAddress = 0;
        private int keyAndMask = 0;

        protected Builder(int i) {
            this.f10856type = i;
        }

        protected abstract XMSSAddress build();

        protected abstract T getThis();

        protected T withKeyAndMask(int i) {
            this.keyAndMask = i;
            return (T) getThis();
        }

        protected T withLayerAddress(int i) {
            this.layerAddress = i;
            return (T) getThis();
        }

        protected T withTreeAddress(long j) {
            this.treeAddress = j;
            return (T) getThis();
        }
    }

    protected XMSSAddress(Builder builder) {
        this.layerAddress = builder.layerAddress;
        this.treeAddress = builder.treeAddress;
        this.f10855type = builder.f10856type;
        this.keyAndMask = builder.keyAndMask;
    }

    public final int getKeyAndMask() {
        return this.keyAndMask;
    }

    protected final int getLayerAddress() {
        return this.layerAddress;
    }

    protected final long getTreeAddress() {
        return this.treeAddress;
    }

    public final int getType() {
        return this.f10855type;
    }

    protected byte[] toByteArray() {
        byte[] bArr = new byte[32];
        Pack.intToBigEndian(this.layerAddress, bArr, 0);
        Pack.longToBigEndian(this.treeAddress, bArr, 4);
        Pack.intToBigEndian(this.f10855type, bArr, 12);
        Pack.intToBigEndian(this.keyAndMask, bArr, 28);
        return bArr;
    }
}
