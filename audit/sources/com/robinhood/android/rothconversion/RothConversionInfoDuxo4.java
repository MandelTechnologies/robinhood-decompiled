package com.robinhood.android.rothconversion;

import com.robinhood.models.p320db.Account;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RothConversionInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rothconversion/RothConversionInfoDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rothconversion.RothConversionInfoDuxo$onStart$1$1", m3645f = "RothConversionInfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rothconversion.RothConversionInfoDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RothConversionInfoDuxo4 extends ContinuationImpl7 implements Function2<RothConversionInfoDataState, Continuation<? super RothConversionInfoDataState>, Object> {
    final /* synthetic */ List<Account> $accounts;
    final /* synthetic */ boolean $inRothConversionExperiment;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RothConversionInfoDuxo4(List<Account> list, boolean z, Continuation<? super RothConversionInfoDuxo4> continuation) {
        super(2, continuation);
        this.$accounts = list;
        this.$inRothConversionExperiment = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RothConversionInfoDuxo4 rothConversionInfoDuxo4 = new RothConversionInfoDuxo4(this.$accounts, this.$inRothConversionExperiment, continuation);
        rothConversionInfoDuxo4.L$0 = obj;
        return rothConversionInfoDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RothConversionInfoDataState rothConversionInfoDataState, Continuation<? super RothConversionInfoDataState> continuation) {
        return ((RothConversionInfoDuxo4) create(rothConversionInfoDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RothConversionInfoDataState.copy$default((RothConversionInfoDataState) this.L$0, null, this.$accounts, null, this.$inRothConversionExperiment, 5, null);
    }
}
