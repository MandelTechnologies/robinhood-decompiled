package com.robinhood.android.advisory.portfolio.restrictstocks;

import android.content.Context;
import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.SnackbarResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.portfolio.C9151R;
import com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RestrictStocksScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksScreenKt$RestrictStocksScreen$4$1$1$1", m3645f = "RestrictStocksScreen.kt", m3646l = {EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class RestrictStocksScreenKt$RestrictStocksScreen$4$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ RestrictStocksDuxo $duxo;
    final /* synthetic */ RestrictStocksEvent.RestrictionError $error;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RestrictStocksScreenKt$RestrictStocksScreen$4$1$1$1(Context context, RestrictStocksEvent.RestrictionError restrictionError, SnackbarHostState snackbarHostState, RestrictStocksDuxo restrictStocksDuxo, Continuation<? super RestrictStocksScreenKt$RestrictStocksScreen$4$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$error = restrictionError;
        this.$snackbarHostState = snackbarHostState;
        this.$duxo = restrictStocksDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RestrictStocksScreenKt$RestrictStocksScreen$4$1$1$1(this.$context, this.$error, this.$snackbarHostState, this.$duxo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RestrictStocksScreenKt$RestrictStocksScreen$4$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String string2;
        RestrictStocksScreenKt$RestrictStocksScreen$4$1$1$1 restrictStocksScreenKt$RestrictStocksScreen$4$1$1$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String string3 = this.$context.getString(C9151R.string.snackbar_retry_button);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            if (this.$error.isTryingToRestrict()) {
                string2 = this.$context.getString(C9151R.string.snackbar_unable_to_restrict, this.$error.getAssetName());
            } else {
                string2 = this.$context.getString(C9151R.string.snackbar_unable_to_allow, this.$error.getAssetName());
            }
            String str = string2;
            Intrinsics.checkNotNull(str);
            SnackbarHostState snackbarHostState = this.$snackbarHostState;
            SnackbarDuration snackbarDuration = SnackbarDuration.Short;
            this.label = 1;
            restrictStocksScreenKt$RestrictStocksScreen$4$1$1$1 = this;
            obj = snackbarHostState.showSnackbar(str, string3, true, snackbarDuration, restrictStocksScreenKt$RestrictStocksScreen$4$1$1$1);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            restrictStocksScreenKt$RestrictStocksScreen$4$1$1$1 = this;
        }
        if (((SnackbarResult) obj) == SnackbarResult.ActionPerformed) {
            restrictStocksScreenKt$RestrictStocksScreen$4$1$1$1.$duxo.updateRestrictedAsset(restrictStocksScreenKt$RestrictStocksScreen$4$1$1$1.$error.getAssetId(), restrictStocksScreenKt$RestrictStocksScreen$4$1$1$1.$error.getAssetName(), restrictStocksScreenKt$RestrictStocksScreen$4$1$1$1.$error.isTryingToRestrict());
        }
        return Unit.INSTANCE;
    }
}
