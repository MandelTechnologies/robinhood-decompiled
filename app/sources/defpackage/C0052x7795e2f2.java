package defpackage;

import android.view.KeyEvent;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferViewState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import defpackage.TransferAccountListConfig;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryFirstDepositTransferComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: ComposableSingletons$AdvisoryFirstDepositTransferComposableKt$lambda$-1980031523$1 */
/* loaded from: classes7.dex */
final class C0052x7795e2f2 implements Function2<Composer, Integer, Unit> {
    public static final C0052x7795e2f2 INSTANCE = new C0052x7795e2f2();

    C0052x7795e2f2() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1980031523, i, -1, "ComposableSingletons$AdvisoryFirstDepositTransferComposableKt.lambda$-1980031523.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:644)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BrokerageAccountType brokerageAccountType = BrokerageAccountType.INDIVIDUAL;
        StringResource.Companion companion2 = StringResource.INSTANCE;
        AdvisoryFirstDepositTransferViewState advisoryFirstDepositTransferViewState = new AdvisoryFirstDepositTransferViewState("First deposit", "$100", null, false, false, false, false, false, true, brokerageAccountType, companion2.invoke("Managed Individual"), extensions2.persistentListOf(), "1234", companion2.invoke("Chase Checking 1234"), false, extensions2.persistentListOf(), new Money(Currencies.USD, new BigDecimal("50")), TransferAccountListConfig.Default.INSTANCE, "", null, null, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function1() { // from class: ComposableSingletons$AdvisoryFirstDepositTransferComposableKt$lambda$-1980031523$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C0052x7795e2f2.invoke$lambda$1$lambda$0((KeyEvent) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: ComposableSingletons$AdvisoryFirstDepositTransferComposableKt$lambda$-1980031523$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C0052x7795e2f2.invoke$lambda$3$lambda$2((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function12 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: ComposableSingletons$AdvisoryFirstDepositTransferComposableKt$lambda$-1980031523$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C0052x7795e2f2.invoke$lambda$5$lambda$4((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function13 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: ComposableSingletons$AdvisoryFirstDepositTransferComposableKt$lambda$-1980031523$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Function0 function0 = (Function0) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion3.getEmpty()) {
            objRememberedValue5 = new Function0() { // from class: ComposableSingletons$AdvisoryFirstDepositTransferComposableKt$lambda$-1980031523$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        AdvisoryFirstDepositTransferComposableKt.FirstTimeDeposit(advisoryFirstDepositTransferViewState, function1, function12, function13, function0, (Function0) objRememberedValue5, companion, composer, 1797552, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(KeyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
