package com.robinhood.android.common.portfolio.position;

import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: LocalPositionDetailsNavigator.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\"+\u0010\u0000\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0001¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"LocalPositionDetailsNavigator", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$EquityInstrumentDetail;", "", "getLocalPositionDetailsNavigator$annotations", "()V", "getLocalPositionDetailsNavigator", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.portfolio.position.LocalPositionDetailsNavigatorKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class LocalPositionDetailsNavigator {
    private static final CompositionLocal6<Function1<LegacyFragmentKey.EquityInstrumentDetail, Unit>> LocalPositionDetailsNavigator = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.common.portfolio.position.LocalPositionDetailsNavigatorKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalPositionDetailsNavigator.LocalPositionDetailsNavigator$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 LocalPositionDetailsNavigator$lambda$0() {
        return null;
    }

    public static /* synthetic */ void getLocalPositionDetailsNavigator$annotations() {
    }

    public static final CompositionLocal6<Function1<LegacyFragmentKey.EquityInstrumentDetail, Unit>> getLocalPositionDetailsNavigator() {
        return LocalPositionDetailsNavigator;
    }
}
