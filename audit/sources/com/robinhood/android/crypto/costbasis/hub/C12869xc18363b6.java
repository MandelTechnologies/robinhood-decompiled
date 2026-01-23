package com.robinhood.android.crypto.costbasis.hub;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.crypto.costbasis.C12782R;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoCostBasisHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-1498561151$1 */
/* loaded from: classes2.dex */
final class C12869xc18363b6 implements Function2<Composer, Integer, Unit> {
    public static final C12869xc18363b6 INSTANCE = new C12869xc18363b6();

    C12869xc18363b6() {
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
            ComposerKt.traceEventStart(-1498561151, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$-1498561151.<anonymous> (CryptoCostBasisHubComposable.kt:359)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
        CryptoCostBasisHubSection cryptoCostBasisHubSection = CryptoCostBasisHubSection.SOLD_IN_2025;
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C12782R.string.crypto_cost_basis_hub_section_sold_in_2025, new Object[0]);
        ArrayList arrayList = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList.add(new CostBasisRow("placeholder_sold_2025_" + i2, null, "---", "-----", "", "-----------------------", 2, null));
        }
        CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState = new CryptoCostBasisHubSectionViewState(cryptoCostBasisHubSection, null, stringResourceInvoke, true, extensions2.toPersistentList(arrayList), false, true, false, 2, null);
        CryptoCostBasisHubSection cryptoCostBasisHubSection2 = CryptoCostBasisHubSection.MISSING_DETAILS;
        StringResource stringResourceInvoke2 = StringResource.INSTANCE.invoke(C12782R.string.crypto_cost_basis_hub_section_missing_details, new Object[0]);
        ArrayList arrayList2 = new ArrayList(3);
        for (int i3 = 0; i3 < 3; i3++) {
            arrayList2.add(new CostBasisRow("placeholder_missing_" + i3, null, "---", "-----", "", "-----------------------", 2, null));
        }
        CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState2 = new CryptoCostBasisHubSectionViewState(cryptoCostBasisHubSection2, null, stringResourceInvoke2, true, extensions2.toPersistentList(arrayList2), false, true, false, 2, null);
        CryptoCostBasisHubSection cryptoCostBasisHubSection3 = CryptoCostBasisHubSection.CONFIRMED;
        StringResource stringResourceInvoke3 = StringResource.INSTANCE.invoke(C12782R.string.crypto_cost_basis_hub_section_confirmed, new Object[0]);
        ArrayList arrayList3 = new ArrayList(5);
        for (int i4 = 0; i4 < 5; i4++) {
            arrayList3.add(new CostBasisRow("placeholder_confirmed_" + i4, null, "---", "-----", "", "------------", 2, null));
        }
        CryptoCostBasisHubViewState cryptoCostBasisHubViewState = new CryptoCostBasisHubViewState(cryptoCostBasisHubSectionViewState, cryptoCostBasisHubSectionViewState2, new CryptoCostBasisHubSectionViewState(cryptoCostBasisHubSection3, null, stringResourceInvoke3, true, extensions2.toPersistentList(arrayList3), false, true, false, 2, null));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-1498561151$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12869xc18363b6.invoke$lambda$4$lambda$3((CryptoCostBasisHubSection) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2 function2 = (Function2) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-1498561151$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12869xc18363b6.invoke$lambda$6$lambda$5((CostBasisRow) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CryptoCostBasisHubComposableKt.CryptoCostBasisHubContent(cryptoCostBasisHubViewState, function2, (Function1) objRememberedValue2, modifierM4872backgroundbw27NRU$default, composer, StringResource.$stable | 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(CryptoCostBasisHubSection cryptoCostBasisHubSection, int i) {
        Intrinsics.checkNotNullParameter(cryptoCostBasisHubSection, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(CostBasisRow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
