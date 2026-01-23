package com.robinhood.android.optionschain.chainsettings.education;

import com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationHelpers;
import com.robinhood.models.p320db.OptionChainCustomizationEducation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionChainCustomizationEducationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.education.OptionChainCustomizationEducationDuxo$onCreate$1$1", m3645f = "OptionChainCustomizationEducationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.chainsettings.education.OptionChainCustomizationEducationDuxo$onCreate$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionChainCustomizationEducationDuxo2 extends ContinuationImpl7 implements Function2<OptionChainCustomizationEducationDataState, Continuation<? super OptionChainCustomizationEducationDataState>, Object> {
    final /* synthetic */ OptionChainCustomizationEducation $education;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainCustomizationEducationDuxo2(OptionChainCustomizationEducation optionChainCustomizationEducation, Continuation<? super OptionChainCustomizationEducationDuxo2> continuation) {
        super(2, continuation);
        this.$education = optionChainCustomizationEducation;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionChainCustomizationEducationDuxo2 optionChainCustomizationEducationDuxo2 = new OptionChainCustomizationEducationDuxo2(this.$education, continuation);
        optionChainCustomizationEducationDuxo2.L$0 = obj;
        return optionChainCustomizationEducationDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionChainCustomizationEducationDataState optionChainCustomizationEducationDataState, Continuation<? super OptionChainCustomizationEducationDataState> continuation) {
        return ((OptionChainCustomizationEducationDuxo2) create(optionChainCustomizationEducationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OptionChainCustomizationEducationDataState.copy$default((OptionChainCustomizationEducationDataState) this.L$0, null, OptionChainCustomizationHelpers.firstIndexOrNull(this.$education.getEducationItems()), this.$education, 1, null);
    }
}
