package com.robinhood.android.acats.plaid.transfer.unsupported;

import android.content.res.Resources;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.acats.C7376R;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.OptionAsset;
import com.robinhood.models.api.bonfire.plaid.brokerassets.AcatsInBrokerAssetOptionPosition;
import com.robinhood.models.api.bonfire.plaid.brokerassets.AcatsInBrokerAssetOptionType;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.robinhood.models.serverdriven.experimental.extensions.Format2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: UnsupportedOptionsRowComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/OptionAsset;", "optionAsset", "j$/time/format/DateTimeFormatter", "dateFormatter", "", "UnsupportedOptionsRowComposable", "(Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/OptionAsset;Lj$/time/format/DateTimeFormatter;Landroidx/compose/runtime/Composer;I)V", "", "", "formatContracts", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "lib-acats-plaid_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.plaid.transfer.unsupported.UnsupportedOptionsRowComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class UnsupportedOptionsRowComposable {

    /* compiled from: UnsupportedOptionsRowComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acats.plaid.transfer.unsupported.UnsupportedOptionsRowComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AcatsInBrokerAssetOptionType.values().length];
            try {
                iArr[AcatsInBrokerAssetOptionType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AcatsInBrokerAssetOptionType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AcatsInBrokerAssetOptionType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AcatsInBrokerAssetOptionPosition.values().length];
            try {
                iArr2[AcatsInBrokerAssetOptionPosition.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AcatsInBrokerAssetOptionPosition.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AcatsInBrokerAssetOptionPosition.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnsupportedOptionsRowComposable$lambda$0(OptionAsset optionAsset, DateTimeFormatter dateTimeFormatter, int i, Composer composer, int i2) throws Resources.NotFoundException {
        UnsupportedOptionsRowComposable(optionAsset, dateTimeFormatter, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void UnsupportedOptionsRowComposable(final OptionAsset optionAsset, final DateTimeFormatter dateFormatter, Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        String strStringResource;
        String str;
        Composer composer2;
        String str2;
        Intrinsics.checkNotNullParameter(optionAsset, "optionAsset");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Composer composerStartRestartGroup = composer.startRestartGroup(786507592);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(optionAsset) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(dateFormatter) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(786507592, i2, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.UnsupportedOptionsRowComposable (UnsupportedOptionsRowComposable.kt:18)");
            }
            String strStringResource2 = dateFormatter.format(optionAsset.getExpirationDate());
            int i3 = WhenMappings.$EnumSwitchMapping$0[optionAsset.getType().ordinal()];
            String str3 = "";
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(1801397358);
                int i4 = C7686R.string.acats_in_build_partial_options_title_call;
                String name = optionAsset.getName();
                Money strikePrice = optionAsset.getStrikePrice();
                if (strikePrice != null && (str = Format2.format(strikePrice)) != null) {
                    str3 = str;
                }
                strStringResource = StringResources_androidKt.stringResource(i4, new Object[]{name, str3}, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i3 == 2) {
                composerStartRestartGroup.startReplaceGroup(1801681039);
                int i5 = C7686R.string.acats_in_build_partial_options_title_put;
                String name2 = optionAsset.getName();
                Money strikePrice2 = optionAsset.getStrikePrice();
                if (strikePrice2 != null && (str2 = Format2.format(strikePrice2)) != null) {
                    str3 = str2;
                }
                strStringResource = StringResources_androidKt.stringResource(i5, new Object[]{name2, str3}, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 3) {
                    composerStartRestartGroup.startReplaceGroup(-80439626);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1801963232);
                composerStartRestartGroup.endReplaceGroup();
                String name3 = optionAsset.getName();
                Money strikePrice3 = optionAsset.getStrikePrice();
                strStringResource = name3 + PlaceholderUtils.XXShortPlaceholderText + (strikePrice3 != null ? Format2.format(strikePrice3) : null);
            }
            int i6 = WhenMappings.$EnumSwitchMapping$1[optionAsset.getPosition().ordinal()];
            if (i6 == 1) {
                composerStartRestartGroup.startReplaceGroup(1802174063);
                strStringResource2 = StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_options_expiration_long, new Object[]{strStringResource2}, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i6 == 2) {
                composerStartRestartGroup.startReplaceGroup(1802431022);
                strStringResource2 = StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_options_expiration_short, new Object[]{strStringResource2}, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i6 != 3) {
                    composerStartRestartGroup.startReplaceGroup(-80414884);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1802686028);
                composerStartRestartGroup.endReplaceGroup();
            }
            composer2 = composerStartRestartGroup;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource, strStringResource2, null, new BentoBaseRowState.Meta.SingleLine(formatContracts(optionAsset.getQuantity().intValue(), composerStartRestartGroup, 0)), null, false, false, false, 0L, null, composer2, BentoBaseRowState.Meta.SingleLine.$stable << 15, 0, 4051);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.UnsupportedOptionsRowComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnsupportedOptionsRowComposable.UnsupportedOptionsRowComposable$lambda$0(optionAsset, dateFormatter, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String formatContracts(int i, Composer composer, int i2) throws Resources.NotFoundException {
        composer.startReplaceGroup(-1473045536);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1473045536, i2, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.formatContracts (UnsupportedOptionsRowComposable.kt:68)");
        }
        String strPluralStringResource = StringResources_androidKt.pluralStringResource(C7376R.plurals.f9878contracts, i, new Object[]{Integer.valueOf(i)}, composer, (i2 << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strPluralStringResource;
    }
}
