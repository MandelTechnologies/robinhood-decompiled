package com.squareup.wire.internal;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: FieldOrOneOfBinding.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00028\u00012\u0006\u0010)\u001a\u00020\u0003H&¢\u0006\u0002\u0010,J\u001f\u0010-\u001a\u00020*2\u0006\u0010+\u001a\u00028\u00012\b\u0010)\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010,J\u0018\u0010.\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u00028\u0000H¦\u0002¢\u0006\u0002\u00100J\u0017\u00101\u001a\u0004\u0018\u00010\u00032\u0006\u0010+\u001a\u00028\u0001H&¢\u0006\u0002\u00100J\u0018\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u0002042\b\u0010)\u001a\u0004\u0018\u00010\u0003J\u0010\u00105\u001a\u00020\u000f2\u0006\u00103\u001a\u000204H\u0002R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0012\u0010\u0013\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0012\u0010\u001a\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0012\u0010\"\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0011R'\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b%\u0010\u0005\u001a\u0004\b&\u0010\u001f¨\u00066"}, m3636d2 = {"Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "M", "B", "", "<init>", "()V", "tag", "", "getTag", "()I", AnnotatedPrivateKey.LABEL, "Lcom/squareup/wire/WireField$Label;", "getLabel", "()Lcom/squareup/wire/WireField$Label;", "redacted", "", "getRedacted", "()Z", "isMap", "isMessage", "name", "", "getName", "()Ljava/lang/String;", "declaredName", "getDeclaredName", "wireFieldJsonName", "getWireFieldJsonName", "keyAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getKeyAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "singleAdapter", "getSingleAdapter", "writeIdentityValues", "getWriteIdentityValues", "adapter", "getAdapter$annotations", "getAdapter", "adapter$delegate", "Lkotlin/Lazy;", "value", "", "builder", "(Ljava/lang/Object;Ljava/lang/Object;)V", "set", "get", "message", "(Ljava/lang/Object;)Ljava/lang/Object;", "getFromBuilder", "omitFromJson", "syntax", "Lcom/squareup/wire/Syntax;", "omitIdentity", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public abstract class FieldOrOneOfBinding<M, B> {

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final Lazy adapter = LazyKt.lazy(new Function0() { // from class: com.squareup.wire.internal.FieldOrOneOfBinding$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FieldOrOneOfBinding.adapter_delegate$lambda$0(this.f$0);
        }
    });

    public static /* synthetic */ void getAdapter$annotations() {
    }

    public abstract Object get(M message);

    public abstract String getDeclaredName();

    public abstract Object getFromBuilder(B builder);

    public abstract ProtoAdapter<?> getKeyAdapter();

    public abstract WireField.Label getLabel();

    public abstract String getName();

    public abstract boolean getRedacted();

    public abstract ProtoAdapter<?> getSingleAdapter();

    public abstract int getTag();

    public abstract String getWireFieldJsonName();

    public abstract boolean getWriteIdentityValues();

    public abstract boolean isMap();

    public abstract boolean isMessage();

    public abstract void set(B builder, Object value);

    public abstract void value(B builder, Object value);

    public final ProtoAdapter<Object> getAdapter() {
        return (ProtoAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter adapter_delegate$lambda$0(FieldOrOneOfBinding fieldOrOneOfBinding) {
        if (fieldOrOneOfBinding.isMap()) {
            ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
            ProtoAdapter<?> keyAdapter = fieldOrOneOfBinding.getKeyAdapter();
            Intrinsics.checkNotNull(keyAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            ProtoAdapter<?> singleAdapter = fieldOrOneOfBinding.getSingleAdapter();
            Intrinsics.checkNotNull(singleAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            ProtoAdapter protoAdapterNewMapAdapter = companion.newMapAdapter(keyAdapter, singleAdapter);
            Intrinsics.checkNotNull(protoAdapterNewMapAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            return protoAdapterNewMapAdapter;
        }
        ProtoAdapter<?> protoAdapterWithLabel$wire_runtime = fieldOrOneOfBinding.getSingleAdapter().withLabel$wire_runtime(fieldOrOneOfBinding.getLabel());
        Intrinsics.checkNotNull(protoAdapterWithLabel$wire_runtime, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        return protoAdapterWithLabel$wire_runtime;
    }

    public final boolean omitFromJson(Syntax syntax, Object value) {
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        if (value == null) {
            return true;
        }
        return omitIdentity(syntax) && Intrinsics.areEqual(value, getAdapter().getIdentity());
    }

    private final boolean omitIdentity(Syntax syntax) {
        if (getWriteIdentityValues()) {
            return false;
        }
        if (getLabel() == WireField.Label.OMIT_IDENTITY) {
            return true;
        }
        if (getLabel().isRepeated() && syntax == Syntax.PROTO_3) {
            return true;
        }
        return isMap() && syntax == Syntax.PROTO_3;
    }
}
