package com.robinhood.android.creditcard.p091ui.creditapplication.address.search;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.SnackbarResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SearchAddressComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressComposableKt$SearchAddress$1$1", m3645f = "SearchAddressComposable.kt", m3646l = {74}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressComposableKt$SearchAddress$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class SearchAddressComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onDismissError;
    final /* synthetic */ String $snackbarErrorMessage;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    final /* synthetic */ SearchAddressViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchAddressComposable2(SearchAddressViewState searchAddressViewState, SnackbarHostState snackbarHostState, String str, Function0<Unit> function0, Continuation<? super SearchAddressComposable2> continuation) {
        super(2, continuation);
        this.$viewState = searchAddressViewState;
        this.$snackbarHostState = snackbarHostState;
        this.$snackbarErrorMessage = str;
        this.$onDismissError = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchAddressComposable2(this.$viewState, this.$snackbarHostState, this.$snackbarErrorMessage, this.$onDismissError, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchAddressComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        SearchAddressComposable2 searchAddressComposable2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$viewState.getShowError()) {
                SnackbarHostState snackbarHostState = this.$snackbarHostState;
                String str = this.$snackbarErrorMessage;
                this.label = 1;
                searchAddressComposable2 = this;
                obj = SnackbarHostState.showSnackbar$default(snackbarHostState, str, null, false, null, searchAddressComposable2, 14, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            searchAddressComposable2 = this;
        }
        if (((SnackbarResult) obj) == SnackbarResult.Dismissed) {
            searchAddressComposable2.$onDismissError.invoke();
        }
        return Unit.INSTANCE;
    }
}
