package com.robinhood.android.crypto.costbasis.hub;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.android.crypto.costbasis.C12782R;
import com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: CryptoCostBasisHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-2007921054$1 */
/* loaded from: classes2.dex */
final class C12870x16a68f33 implements Function2<Composer, Integer, Unit> {
    public static final C12870x16a68f33 INSTANCE = new C12870x16a68f33();

    C12870x16a68f33() {
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
            ComposerKt.traceEventStart(-2007921054, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$-2007921054.<anonymous> (CryptoCostBasisHubComposable.kt:431)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
        CryptoCostBasisHubSection cryptoCostBasisHubSection = CryptoCostBasisHubSection.SOLD_IN_2025;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C12782R.string.crypto_cost_basis_hub_section_sold_in_2025, new Object[0]);
        LocalizedDateTimeFormatter localizedDateTimeFormatter = new LocalizedDateTimeFormatter((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        Instant instant = Instant.parse("2025-07-30T12:00:00Z");
        Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
        LocalizedDateTimeFormatter.Format.MediumDate mediumDate = LocalizedDateTimeFormatter.Format.MediumDate.INSTANCE;
        CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState = new CryptoCostBasisHubSectionViewState(cryptoCostBasisHubSection, null, stringResourceInvoke, false, extensions2.toPersistentList(CollectionsKt.listOf(new CostBasisRow(Constants.SdidMigrationStatusCodes.ALREADY_SDID, null, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, "9.59", "Needs details", localizedDateTimeFormatter.format(instant, mediumDate), 2, null))), false, false, false, 2, null);
        CryptoCostBasisHubSection cryptoCostBasisHubSection2 = CryptoCostBasisHubSection.MISSING_DETAILS;
        StringResource stringResourceInvoke2 = companion.invoke(C12782R.string.crypto_cost_basis_hub_section_missing_details, new Object[0]);
        LocalizedDateTimeFormatter localizedDateTimeFormatter2 = new LocalizedDateTimeFormatter((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        Instant instant2 = Instant.parse("2025-07-25T10:30:00Z");
        Intrinsics.checkNotNullExpressionValue(instant2, "parse(...)");
        CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState2 = new CryptoCostBasisHubSectionViewState(cryptoCostBasisHubSection2, null, stringResourceInvoke2, false, extensions2.toPersistentList(CollectionsKt.listOf(new CostBasisRow(Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, null, "ETH", "2.34", "Needs action", localizedDateTimeFormatter2.format(instant2, mediumDate), 2, null))), false, true, false, 2, null);
        CryptoCostBasisHubSection cryptoCostBasisHubSection3 = CryptoCostBasisHubSection.CONFIRMED;
        StringResource stringResourceInvoke3 = companion.invoke(C12782R.string.crypto_cost_basis_hub_section_confirmed, new Object[0]);
        LocalizedDateTimeFormatter localizedDateTimeFormatter3 = new LocalizedDateTimeFormatter((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        Instant instant3 = Instant.parse("2025-07-15T14:20:00Z");
        Intrinsics.checkNotNullExpressionValue(instant3, "parse(...)");
        CostBasisRow costBasisRow = new CostBasisRow(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET, null, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, "5.00", "Completed", localizedDateTimeFormatter3.format(instant3, mediumDate), 2, null);
        LocalizedDateTimeFormatter localizedDateTimeFormatter4 = new LocalizedDateTimeFormatter((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        Instant instant4 = Instant.parse("2025-07-10T09:15:00Z");
        Intrinsics.checkNotNullExpressionValue(instant4, "parse(...)");
        CryptoCostBasisHubViewState cryptoCostBasisHubViewState = new CryptoCostBasisHubViewState(cryptoCostBasisHubSectionViewState, cryptoCostBasisHubSectionViewState2, new CryptoCostBasisHubSectionViewState(cryptoCostBasisHubSection3, null, stringResourceInvoke3, false, extensions2.toPersistentList(CollectionsKt.listOf((Object[]) new CostBasisRow[]{costBasisRow, new CostBasisRow(Constants.SdidMigrationStatusCodes.MISSING_PARAMS, null, "SOL", "100.50", "Completed", localizedDateTimeFormatter4.format(instant4, mediumDate), 2, null)})), false, false, false, 2, null));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-2007921054$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12870x16a68f33.invoke$lambda$1$lambda$0((CryptoCostBasisHubSection) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2 function2 = (Function2) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-2007921054$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12870x16a68f33.invoke$lambda$3$lambda$2((CostBasisRow) obj);
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
    public static final Unit invoke$lambda$1$lambda$0(CryptoCostBasisHubSection cryptoCostBasisHubSection, int i) {
        Intrinsics.checkNotNullParameter(cryptoCostBasisHubSection, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(CostBasisRow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
