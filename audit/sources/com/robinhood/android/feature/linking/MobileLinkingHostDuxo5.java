package com.robinhood.android.feature.linking;

import com.robinhood.models.serverdriven.experimental.api.Direction;
import hippo.model.p469v1.BackgroundAuraVariantDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: MobileLinkingHostDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lhippo/model/v1/BackgroundAuraVariantDto;", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "aura", "direction"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$3$2", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$2$3$2, reason: use source file name */
/* loaded from: classes3.dex */
final class MobileLinkingHostDuxo5 extends ContinuationImpl7 implements Function3<BackgroundAuraVariantDto, Direction, Continuation<? super Tuples2<? extends BackgroundAuraVariantDto, ? extends Direction>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    MobileLinkingHostDuxo5(Continuation<? super MobileLinkingHostDuxo5> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(BackgroundAuraVariantDto backgroundAuraVariantDto, Direction direction, Continuation<? super Tuples2<? extends BackgroundAuraVariantDto, ? extends Direction>> continuation) {
        MobileLinkingHostDuxo5 mobileLinkingHostDuxo5 = new MobileLinkingHostDuxo5(continuation);
        mobileLinkingHostDuxo5.L$0 = backgroundAuraVariantDto;
        mobileLinkingHostDuxo5.L$1 = direction;
        return mobileLinkingHostDuxo5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Tuples4.m3642to((BackgroundAuraVariantDto) this.L$0, (Direction) this.L$1);
    }
}
