package com.robinhood.shared.phone;

import com.robinhood.models.p355ui.identi.PhoneProhibitedCountryCodes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SelectCountryCodeBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.phone.SelectCountryCodeBottomSheetDuxo$onStart$1$1", m3645f = "SelectCountryCodeBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.phone.SelectCountryCodeBottomSheetDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class SelectCountryCodeBottomSheetDuxo2 extends ContinuationImpl7 implements Function2<SelectCountryCodeBottomSheetDataState, Continuation<? super SelectCountryCodeBottomSheetDataState>, Object> {
    final /* synthetic */ PhoneProhibitedCountryCodes $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectCountryCodeBottomSheetDuxo2(PhoneProhibitedCountryCodes phoneProhibitedCountryCodes, Continuation<? super SelectCountryCodeBottomSheetDuxo2> continuation) {
        super(2, continuation);
        this.$it = phoneProhibitedCountryCodes;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SelectCountryCodeBottomSheetDuxo2 selectCountryCodeBottomSheetDuxo2 = new SelectCountryCodeBottomSheetDuxo2(this.$it, continuation);
        selectCountryCodeBottomSheetDuxo2.L$0 = obj;
        return selectCountryCodeBottomSheetDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SelectCountryCodeBottomSheetDataState selectCountryCodeBottomSheetDataState, Continuation<? super SelectCountryCodeBottomSheetDataState> continuation) {
        return ((SelectCountryCodeBottomSheetDuxo2) create(selectCountryCodeBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return SelectCountryCodeBottomSheetDataState.copy$default((SelectCountryCodeBottomSheetDataState) this.L$0, null, this.$it.getProhibitedCountryCodes(), false, false, 13, null);
    }
}
