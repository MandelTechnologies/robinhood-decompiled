package com.robinhood.android.odyssey.lib.template.citizen;

import androidx.compose.foundation.lazy.LazyListState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.serverdrivenui.component.ApiSdOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SdSearchCitizenSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$CitizenSelectionRows$2$1", m3645f = "SdSearchCitizenSelectorComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$CitizenSelectionRows$2$1, reason: use source file name */
/* loaded from: classes10.dex */
final class SdSearchCitizenSelectorComposable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ ImmutableList3<ApiSdOption> $selectableOptions;
    final /* synthetic */ ApiSdOption $selectedOption;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SdSearchCitizenSelectorComposable4(ImmutableList3<ApiSdOption> immutableList3, ApiSdOption apiSdOption, LazyListState lazyListState, Continuation<? super SdSearchCitizenSelectorComposable4> continuation) {
        super(2, continuation);
        this.$selectableOptions = immutableList3;
        this.$selectedOption = apiSdOption;
        this.$listState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SdSearchCitizenSelectorComposable4(this.$selectableOptions, this.$selectedOption, this.$listState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SdSearchCitizenSelectorComposable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int iCoerceAtLeast = RangesKt.coerceAtLeast(CollectionsKt.indexOf((List<? extends ApiSdOption>) this.$selectableOptions, this.$selectedOption), 0);
            LazyListState lazyListState = this.$listState;
            this.label = 1;
            if (LazyListState.animateScrollToItem$default(lazyListState, iCoerceAtLeast, 0, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
