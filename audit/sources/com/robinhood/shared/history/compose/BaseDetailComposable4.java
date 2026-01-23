package com.robinhood.shared.history.compose;

import android.content.Context;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoTextButton2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BaseDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.history.compose.BaseDetailComposableKt$BaseDetailTopBar$1$3, reason: use source file name */
/* loaded from: classes6.dex */
final class BaseDetailComposable4 implements Function3<Row5, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ BaseDetailState $this_with;

    BaseDetailComposable4(BaseDetailState baseDetailState, Context context, Navigator navigator) {
        this.$this_with = baseDetailState;
        this.$context = context;
        this.$navigator = navigator;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
        invoke(row5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1839774959, i, -1, "com.robinhood.shared.history.compose.BaseDetailTopBar.<anonymous>.<anonymous> (BaseDetailComposable.kt:89)");
        }
        Underlying underlying = this.$this_with.getUnderlying();
        if (underlying != null) {
            final Context context = this.$context;
            final BaseDetailState baseDetailState = this.$this_with;
            final Navigator navigator = this.$navigator;
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, BaseDetailComposable.BASE_DETAIL_TEST_TAG_UNDERLYING);
            String string2 = context.getString(C38997R.string.base_detail_view_symbol, underlying.getSymbol());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(baseDetailState) | composer.changedInstance(navigator) | composer.changedInstance(context);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.history.compose.BaseDetailComposableKt$BaseDetailTopBar$1$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseDetailComposable4.invoke$lambda$2$lambda$1$lambda$0(baseDetailState, navigator, context);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, string2, modifierTestTag, null, null, false, null, composer, 384, 120);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(BaseDetailState baseDetailState, Navigator navigator, Context context) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, baseDetailState.getUnderlying().toFragmentKey(baseDetailState.getAccountNumber()), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }
}
