package com.squareup.workflow1;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: Snapshot.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001b\u0010\u0006\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/squareup/workflow1/Snapshot;", "", "toByteString", "Lkotlin/Function0;", "Lokio/ByteString;", "(Lkotlin/jvm/functions/Function0;)V", "bytes", "()Lokio/ByteString;", "bytes$delegate", "Lkotlin/Lazy;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Snapshot {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: bytes$delegate, reason: from kotlin metadata */
    private final Lazy bytes;
    private final Function0<ByteString> toByteString;

    public /* synthetic */ Snapshot(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Snapshot(Function0<? extends ByteString> function0) {
        this.toByteString = function0;
        this.bytes = LazyKt.lazy(new Function0<ByteString>() { // from class: com.squareup.workflow1.Snapshot.bytes.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ByteString invoke() {
                return (ByteString) Snapshot.this.toByteString.invoke();
            }
        });
    }

    /* compiled from: Snapshot.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ#\u0010\u000f\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/squareup/workflow1/Snapshot$Companion;", "", "<init>", "()V", "Lokio/ByteString;", "byteString", "Lcom/squareup/workflow1/Snapshot;", "of", "(Lokio/ByteString;)Lcom/squareup/workflow1/Snapshot;", "Lkotlin/Function0;", "lazy", "(Lkotlin/jvm/functions/Function0;)Lcom/squareup/workflow1/Snapshot;", "Lkotlin/Function1;", "Lokio/BufferedSink;", "", "write", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/workflow1/Snapshot;", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        /* renamed from: of */
        public final Snapshot m3156of(final ByteString byteString) {
            Intrinsics.checkNotNullParameter(byteString, "byteString");
            return new Snapshot(new Function0<ByteString>() { // from class: com.squareup.workflow1.Snapshot$Companion$of$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final ByteString invoke() {
                    return byteString;
                }
            }, null);
        }

        @JvmStatic
        /* renamed from: of */
        public final Snapshot m3155of(Function0<? extends ByteString> lazy) {
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            return new Snapshot(lazy, null);
        }

        @JvmStatic
        public final Snapshot write(final Function1<? super BufferedSink, Unit> lazy) {
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            return m3155of(new Function0<ByteString>() { // from class: com.squareup.workflow1.Snapshot$Companion$write$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final ByteString invoke() {
                    Buffer buffer = new Buffer();
                    lazy.invoke(buffer);
                    return buffer.readByteString();
                }
            });
        }
    }

    @JvmName
    public final ByteString bytes() {
        return (ByteString) this.bytes.getValue();
    }

    public String toString() {
        return "Snapshot(" + bytes() + ')';
    }

    public boolean equals(Object other) {
        Snapshot snapshot = other instanceof Snapshot ? (Snapshot) other : null;
        if (snapshot == null) {
            return false;
        }
        return Intrinsics.areEqual(bytes(), snapshot.bytes());
    }

    public int hashCode() {
        return bytes().hashCode();
    }
}
