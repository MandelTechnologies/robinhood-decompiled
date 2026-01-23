package com.robinhood.shared.documents.prism.timeseries;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrismTimeSeriesEntry.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b7\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0001CB¥\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\"\u001a\u00020\u0005H\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u0010(\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u0010)\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u00102\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u00103\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u00104\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u00105\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u00106\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u00107\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u00108\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u00109\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u0010:\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J\u0010\u0010;\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010&J¬\u0002\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!¨\u0006D"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/timeseries/PrismTimeSeriesEntry;", "", "timestamp", "", "event", "", "quaternionX", "", "quaternionY", "quaternionZ", "quaternionW", "rotationX", "rotationY", "rotationZ", "rotationRateX", "rotationRateY", "rotationRateZ", "rotationRateErrorX", "rotationRateErrorY", "rotationRateErrorZ", "userAccelerationX", "userAccelerationY", "userAccelerationZ", "rawAccelerationWithGravityX", "rawAccelerationWithGravityY", "rawAccelerationWithGravityZ", "gravityVectorX", "gravityVectorY", "gravityVectorZ", "<init>", "(JLjava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getTimestamp", "()J", "Ljava/lang/Float;", "toString", "component1", "component2", "component3", "()Ljava/lang/Float;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(JLjava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/robinhood/shared/documents/prism/timeseries/PrismTimeSeriesEntry;", "equals", "", "other", "hashCode", "", "Companion", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PrismTimeSeriesEntry {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String event;
    private final Float gravityVectorX;
    private final Float gravityVectorY;
    private final Float gravityVectorZ;
    private final Float quaternionW;
    private final Float quaternionX;
    private final Float quaternionY;
    private final Float quaternionZ;
    private final Float rawAccelerationWithGravityX;
    private final Float rawAccelerationWithGravityY;
    private final Float rawAccelerationWithGravityZ;
    private final Float rotationRateErrorX;
    private final Float rotationRateErrorY;
    private final Float rotationRateErrorZ;
    private final Float rotationRateX;
    private final Float rotationRateY;
    private final Float rotationRateZ;
    private final Float rotationX;
    private final Float rotationY;
    private final Float rotationZ;
    private final long timestamp;
    private final Float userAccelerationX;
    private final Float userAccelerationY;
    private final Float userAccelerationZ;

    public PrismTimeSeriesEntry() {
        this(0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
    }

    /* renamed from: component10, reason: from getter */
    private final Float getRotationRateX() {
        return this.rotationRateX;
    }

    /* renamed from: component11, reason: from getter */
    private final Float getRotationRateY() {
        return this.rotationRateY;
    }

    /* renamed from: component12, reason: from getter */
    private final Float getRotationRateZ() {
        return this.rotationRateZ;
    }

    /* renamed from: component13, reason: from getter */
    private final Float getRotationRateErrorX() {
        return this.rotationRateErrorX;
    }

    /* renamed from: component14, reason: from getter */
    private final Float getRotationRateErrorY() {
        return this.rotationRateErrorY;
    }

    /* renamed from: component15, reason: from getter */
    private final Float getRotationRateErrorZ() {
        return this.rotationRateErrorZ;
    }

    /* renamed from: component16, reason: from getter */
    private final Float getUserAccelerationX() {
        return this.userAccelerationX;
    }

    /* renamed from: component17, reason: from getter */
    private final Float getUserAccelerationY() {
        return this.userAccelerationY;
    }

    /* renamed from: component18, reason: from getter */
    private final Float getUserAccelerationZ() {
        return this.userAccelerationZ;
    }

    /* renamed from: component19, reason: from getter */
    private final Float getRawAccelerationWithGravityX() {
        return this.rawAccelerationWithGravityX;
    }

    /* renamed from: component2, reason: from getter */
    private final String getEvent() {
        return this.event;
    }

    /* renamed from: component20, reason: from getter */
    private final Float getRawAccelerationWithGravityY() {
        return this.rawAccelerationWithGravityY;
    }

    /* renamed from: component21, reason: from getter */
    private final Float getRawAccelerationWithGravityZ() {
        return this.rawAccelerationWithGravityZ;
    }

    /* renamed from: component22, reason: from getter */
    private final Float getGravityVectorX() {
        return this.gravityVectorX;
    }

    /* renamed from: component23, reason: from getter */
    private final Float getGravityVectorY() {
        return this.gravityVectorY;
    }

    /* renamed from: component24, reason: from getter */
    private final Float getGravityVectorZ() {
        return this.gravityVectorZ;
    }

    /* renamed from: component3, reason: from getter */
    private final Float getQuaternionX() {
        return this.quaternionX;
    }

    /* renamed from: component4, reason: from getter */
    private final Float getQuaternionY() {
        return this.quaternionY;
    }

    /* renamed from: component5, reason: from getter */
    private final Float getQuaternionZ() {
        return this.quaternionZ;
    }

    /* renamed from: component6, reason: from getter */
    private final Float getQuaternionW() {
        return this.quaternionW;
    }

    /* renamed from: component7, reason: from getter */
    private final Float getRotationX() {
        return this.rotationX;
    }

    /* renamed from: component8, reason: from getter */
    private final Float getRotationY() {
        return this.rotationY;
    }

    /* renamed from: component9, reason: from getter */
    private final Float getRotationZ() {
        return this.rotationZ;
    }

    public static /* synthetic */ PrismTimeSeriesEntry copy$default(PrismTimeSeriesEntry prismTimeSeriesEntry, long j, String str, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Float f13, Float f14, Float f15, Float f16, Float f17, Float f18, Float f19, Float f20, Float f21, Float f22, int i, Object obj) {
        Float f23;
        Float f24;
        long j2 = (i & 1) != 0 ? prismTimeSeriesEntry.timestamp : j;
        String str2 = (i & 2) != 0 ? prismTimeSeriesEntry.event : str;
        Float f25 = (i & 4) != 0 ? prismTimeSeriesEntry.quaternionX : f;
        Float f26 = (i & 8) != 0 ? prismTimeSeriesEntry.quaternionY : f2;
        Float f27 = (i & 16) != 0 ? prismTimeSeriesEntry.quaternionZ : f3;
        Float f28 = (i & 32) != 0 ? prismTimeSeriesEntry.quaternionW : f4;
        Float f29 = (i & 64) != 0 ? prismTimeSeriesEntry.rotationX : f5;
        Float f30 = (i & 128) != 0 ? prismTimeSeriesEntry.rotationY : f6;
        Float f31 = (i & 256) != 0 ? prismTimeSeriesEntry.rotationZ : f7;
        Float f32 = (i & 512) != 0 ? prismTimeSeriesEntry.rotationRateX : f8;
        Float f33 = (i & 1024) != 0 ? prismTimeSeriesEntry.rotationRateY : f9;
        Float f34 = (i & 2048) != 0 ? prismTimeSeriesEntry.rotationRateZ : f10;
        Float f35 = (i & 4096) != 0 ? prismTimeSeriesEntry.rotationRateErrorX : f11;
        long j3 = j2;
        Float f36 = (i & 8192) != 0 ? prismTimeSeriesEntry.rotationRateErrorY : f12;
        Float f37 = (i & 16384) != 0 ? prismTimeSeriesEntry.rotationRateErrorZ : f13;
        Float f38 = (i & 32768) != 0 ? prismTimeSeriesEntry.userAccelerationX : f14;
        Float f39 = (i & 65536) != 0 ? prismTimeSeriesEntry.userAccelerationY : f15;
        Float f40 = (i & 131072) != 0 ? prismTimeSeriesEntry.userAccelerationZ : f16;
        Float f41 = (i & 262144) != 0 ? prismTimeSeriesEntry.rawAccelerationWithGravityX : f17;
        Float f42 = (i & 524288) != 0 ? prismTimeSeriesEntry.rawAccelerationWithGravityY : f18;
        Float f43 = (i & 1048576) != 0 ? prismTimeSeriesEntry.rawAccelerationWithGravityZ : f19;
        Float f44 = (i & 2097152) != 0 ? prismTimeSeriesEntry.gravityVectorX : f20;
        Float f45 = (i & 4194304) != 0 ? prismTimeSeriesEntry.gravityVectorY : f21;
        if ((i & 8388608) != 0) {
            f24 = f45;
            f23 = prismTimeSeriesEntry.gravityVectorZ;
        } else {
            f23 = f22;
            f24 = f45;
        }
        return prismTimeSeriesEntry.copy(j3, str2, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35, f36, f37, f38, f39, f40, f41, f42, f43, f44, f24, f23);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final PrismTimeSeriesEntry copy(long timestamp, String event, Float quaternionX, Float quaternionY, Float quaternionZ, Float quaternionW, Float rotationX, Float rotationY, Float rotationZ, Float rotationRateX, Float rotationRateY, Float rotationRateZ, Float rotationRateErrorX, Float rotationRateErrorY, Float rotationRateErrorZ, Float userAccelerationX, Float userAccelerationY, Float userAccelerationZ, Float rawAccelerationWithGravityX, Float rawAccelerationWithGravityY, Float rawAccelerationWithGravityZ, Float gravityVectorX, Float gravityVectorY, Float gravityVectorZ) {
        return new PrismTimeSeriesEntry(timestamp, event, quaternionX, quaternionY, quaternionZ, quaternionW, rotationX, rotationY, rotationZ, rotationRateX, rotationRateY, rotationRateZ, rotationRateErrorX, rotationRateErrorY, rotationRateErrorZ, userAccelerationX, userAccelerationY, userAccelerationZ, rawAccelerationWithGravityX, rawAccelerationWithGravityY, rawAccelerationWithGravityZ, gravityVectorX, gravityVectorY, gravityVectorZ);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrismTimeSeriesEntry)) {
            return false;
        }
        PrismTimeSeriesEntry prismTimeSeriesEntry = (PrismTimeSeriesEntry) other;
        return this.timestamp == prismTimeSeriesEntry.timestamp && Intrinsics.areEqual(this.event, prismTimeSeriesEntry.event) && Intrinsics.areEqual((Object) this.quaternionX, (Object) prismTimeSeriesEntry.quaternionX) && Intrinsics.areEqual((Object) this.quaternionY, (Object) prismTimeSeriesEntry.quaternionY) && Intrinsics.areEqual((Object) this.quaternionZ, (Object) prismTimeSeriesEntry.quaternionZ) && Intrinsics.areEqual((Object) this.quaternionW, (Object) prismTimeSeriesEntry.quaternionW) && Intrinsics.areEqual((Object) this.rotationX, (Object) prismTimeSeriesEntry.rotationX) && Intrinsics.areEqual((Object) this.rotationY, (Object) prismTimeSeriesEntry.rotationY) && Intrinsics.areEqual((Object) this.rotationZ, (Object) prismTimeSeriesEntry.rotationZ) && Intrinsics.areEqual((Object) this.rotationRateX, (Object) prismTimeSeriesEntry.rotationRateX) && Intrinsics.areEqual((Object) this.rotationRateY, (Object) prismTimeSeriesEntry.rotationRateY) && Intrinsics.areEqual((Object) this.rotationRateZ, (Object) prismTimeSeriesEntry.rotationRateZ) && Intrinsics.areEqual((Object) this.rotationRateErrorX, (Object) prismTimeSeriesEntry.rotationRateErrorX) && Intrinsics.areEqual((Object) this.rotationRateErrorY, (Object) prismTimeSeriesEntry.rotationRateErrorY) && Intrinsics.areEqual((Object) this.rotationRateErrorZ, (Object) prismTimeSeriesEntry.rotationRateErrorZ) && Intrinsics.areEqual((Object) this.userAccelerationX, (Object) prismTimeSeriesEntry.userAccelerationX) && Intrinsics.areEqual((Object) this.userAccelerationY, (Object) prismTimeSeriesEntry.userAccelerationY) && Intrinsics.areEqual((Object) this.userAccelerationZ, (Object) prismTimeSeriesEntry.userAccelerationZ) && Intrinsics.areEqual((Object) this.rawAccelerationWithGravityX, (Object) prismTimeSeriesEntry.rawAccelerationWithGravityX) && Intrinsics.areEqual((Object) this.rawAccelerationWithGravityY, (Object) prismTimeSeriesEntry.rawAccelerationWithGravityY) && Intrinsics.areEqual((Object) this.rawAccelerationWithGravityZ, (Object) prismTimeSeriesEntry.rawAccelerationWithGravityZ) && Intrinsics.areEqual((Object) this.gravityVectorX, (Object) prismTimeSeriesEntry.gravityVectorX) && Intrinsics.areEqual((Object) this.gravityVectorY, (Object) prismTimeSeriesEntry.gravityVectorY) && Intrinsics.areEqual((Object) this.gravityVectorZ, (Object) prismTimeSeriesEntry.gravityVectorZ);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.timestamp) * 31;
        String str = this.event;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.quaternionX;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.quaternionY;
        int iHashCode4 = (iHashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.quaternionZ;
        int iHashCode5 = (iHashCode4 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.quaternionW;
        int iHashCode6 = (iHashCode5 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.rotationX;
        int iHashCode7 = (iHashCode6 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.rotationY;
        int iHashCode8 = (iHashCode7 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.rotationZ;
        int iHashCode9 = (iHashCode8 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f8 = this.rotationRateX;
        int iHashCode10 = (iHashCode9 + (f8 == null ? 0 : f8.hashCode())) * 31;
        Float f9 = this.rotationRateY;
        int iHashCode11 = (iHashCode10 + (f9 == null ? 0 : f9.hashCode())) * 31;
        Float f10 = this.rotationRateZ;
        int iHashCode12 = (iHashCode11 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.rotationRateErrorX;
        int iHashCode13 = (iHashCode12 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.rotationRateErrorY;
        int iHashCode14 = (iHashCode13 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Float f13 = this.rotationRateErrorZ;
        int iHashCode15 = (iHashCode14 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.userAccelerationX;
        int iHashCode16 = (iHashCode15 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.userAccelerationY;
        int iHashCode17 = (iHashCode16 + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.userAccelerationZ;
        int iHashCode18 = (iHashCode17 + (f16 == null ? 0 : f16.hashCode())) * 31;
        Float f17 = this.rawAccelerationWithGravityX;
        int iHashCode19 = (iHashCode18 + (f17 == null ? 0 : f17.hashCode())) * 31;
        Float f18 = this.rawAccelerationWithGravityY;
        int iHashCode20 = (iHashCode19 + (f18 == null ? 0 : f18.hashCode())) * 31;
        Float f19 = this.rawAccelerationWithGravityZ;
        int iHashCode21 = (iHashCode20 + (f19 == null ? 0 : f19.hashCode())) * 31;
        Float f20 = this.gravityVectorX;
        int iHashCode22 = (iHashCode21 + (f20 == null ? 0 : f20.hashCode())) * 31;
        Float f21 = this.gravityVectorY;
        int iHashCode23 = (iHashCode22 + (f21 == null ? 0 : f21.hashCode())) * 31;
        Float f22 = this.gravityVectorZ;
        return iHashCode23 + (f22 != null ? f22.hashCode() : 0);
    }

    public PrismTimeSeriesEntry(long j, String str, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Float f13, Float f14, Float f15, Float f16, Float f17, Float f18, Float f19, Float f20, Float f21, Float f22) {
        this.timestamp = j;
        this.event = str;
        this.quaternionX = f;
        this.quaternionY = f2;
        this.quaternionZ = f3;
        this.quaternionW = f4;
        this.rotationX = f5;
        this.rotationY = f6;
        this.rotationZ = f7;
        this.rotationRateX = f8;
        this.rotationRateY = f9;
        this.rotationRateZ = f10;
        this.rotationRateErrorX = f11;
        this.rotationRateErrorY = f12;
        this.rotationRateErrorZ = f13;
        this.userAccelerationX = f14;
        this.userAccelerationY = f15;
        this.userAccelerationZ = f16;
        this.rawAccelerationWithGravityX = f17;
        this.rawAccelerationWithGravityY = f18;
        this.rawAccelerationWithGravityZ = f19;
        this.gravityVectorX = f20;
        this.gravityVectorY = f21;
        this.gravityVectorZ = f22;
    }

    public /* synthetic */ PrismTimeSeriesEntry(long j, String str, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Float f13, Float f14, Float f15, Float f16, Float f17, Float f18, Float f19, Float f20, Float f21, Float f22, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SystemClock.elapsedRealtime() : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : f2, (i & 16) != 0 ? null : f3, (i & 32) != 0 ? null : f4, (i & 64) != 0 ? null : f5, (i & 128) != 0 ? null : f6, (i & 256) != 0 ? null : f7, (i & 512) != 0 ? null : f8, (i & 1024) != 0 ? null : f9, (i & 2048) != 0 ? null : f10, (i & 4096) != 0 ? null : f11, (i & 8192) != 0 ? null : f12, (i & 16384) != 0 ? null : f13, (32768 & i) != 0 ? null : f14, (i & 65536) != 0 ? null : f15, (i & 131072) != 0 ? null : f16, (i & 262144) != 0 ? null : f17, (i & 524288) != 0 ? null : f18, (i & 1048576) != 0 ? null : f19, (i & 2097152) != 0 ? null : f20, (i & 4194304) != 0 ? null : f21, (i & 8388608) != 0 ? null : f22);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public String toString() {
        return CollectionsKt.joinToString$default(CollectionsKt.listOf(Long.valueOf(this.timestamp), this.event, this.quaternionX, this.quaternionY, this.quaternionZ, this.quaternionW, this.rotationX, this.rotationY, this.rotationZ, this.rotationRateX, this.rotationRateY, this.rotationRateZ, this.rotationRateErrorX, this.rotationRateErrorY, this.rotationRateErrorZ, this.userAccelerationX, this.userAccelerationY, this.userAccelerationZ, this.rawAccelerationWithGravityX, this.rawAccelerationWithGravityY, this.rawAccelerationWithGravityZ, this.gravityVectorX, this.gravityVectorY, this.gravityVectorZ), ",", null, "\n", 0, null, new Function1<?, CharSequence>() { // from class: com.robinhood.shared.documents.prism.timeseries.PrismTimeSeriesEntry.toString.1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(Object obj) {
                String string2 = obj != 0 ? obj.toString() : null;
                return string2 == null ? "" : string2;
            }
        }, 26, null);
    }

    /* compiled from: PrismTimeSeriesEntry.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/timeseries/PrismTimeSeriesEntry$Companion;", "", "<init>", "()V", "getHeader", "", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getHeader() {
            return "timestamp,event,quaternion_x,quaternion_y,quaternion_z,quaternion_w,rotation_x,rotation_y,rotation_z,rotation_rate_x,rotation_rate_y,rotation_rate_z,rotation_rate_error_x,rotation_rate_error_y,rotation_rate_error_z,user_acceleration_x,user_acceleration_y,user_acceleration_z,raw_acceleration_with_gravity_x,raw_acceleration_with_gravity_y,raw_acceleration_with_gravity_z,gravity_vector_x,gravity_vector_y,gravity_vector_z\n";
        }
    }
}
