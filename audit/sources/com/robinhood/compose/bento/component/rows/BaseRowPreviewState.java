package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.singular.sdk.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SpreadBuilder;

/* compiled from: BentoBaseRow.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010E\u001a\b\u0012\u0004\u0012\u00020)0FH\u0000¢\u0006\u0004\bG\u0010HJ\u0013\u0010I\u001a\b\u0012\u0004\u0012\u00020)0JH\u0007¢\u0006\u0002\u0010KR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00168CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u00020%8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0014\u0010.\u001a\u00020)8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u00020)8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R\u0014\u00103\u001a\u00020)8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R\u0014\u00105\u001a\u00020)8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00100R\u0014\u00107\u001a\u00020)8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u00100R\u0014\u00109\u001a\u00020)8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u00100R\u0014\u0010;\u001a\u00020)8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u00100R\u0014\u0010=\u001a\u00020)8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u00100R\u0014\u0010?\u001a\u00020)8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u00100R\u0014\u0010A\u001a\u00020)8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u00100R\u0014\u0010C\u001a\u00020)8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u00100¨\u0006L"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BaseRowPreviewState;", "", "<init>", "()V", Constants.RequestParamsKeys.PLATFORM_KEY, "", Constants.RequestParamsKeys.SESSION_ID_KEY, "m", "mLong", "m2", AccountOverviewOptionsSettingCard4.CTA, "icon24", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "icon16", "icon12", "start", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "getStart", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "layeredIconStart", "getLayeredIconStart", "metaIcon", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$Icon;", "getMetaIcon", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$Icon;", "metaSingleAndIcon", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$SingleLineAndIcon;", "getMetaSingleAndIcon", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$SingleLineAndIcon;", "metaSingleLine", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$SingleLine;", "metaSingleLineLong", "metaTwoline", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$TwoLine;", "metaTwolineIcon", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$TwoLineAndIcon;", "metaCta", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$CallToAction;", "getMetaCta", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta$CallToAction;", "row_primary", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "getRow_primary$lib_compose_bento_externalRelease", "()Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "row_primary_loading", "getRow_primary_loading$lib_compose_bento_externalRelease", "row_icon_primary_metaSingle", "getRow_icon_primary_metaSingle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "row_layered_icon_primary_metaSingle", "getRow_layered_icon_primary_metaSingle", "row_icon_primary_secondary", "getRow_icon_primary_secondary", "row_icon_primary_secondary_metaSingleLine", "getRow_icon_primary_secondary_metaSingleLine", "row_icon_primary_secondary_metaTwoLine", "getRow_icon_primary_secondary_metaTwoLine", "row_icon_primary_secondary_metaSingleLineAndIcon", "getRow_icon_primary_secondary_metaSingleLineAndIcon", "row_icon_primary_secondary_metaSingleLineLong", "getRow_icon_primary_secondary_metaSingleLineLong", "row_icon_primary_metaTwoLine", "getRow_icon_primary_metaTwoLine", "row_icon_primary_secondary_metaCTA", "getRow_icon_primary_secondary_metaCTA", "row_icon_primary_secondary_metaIcon", "getRow_icon_primary_secondary_metaIcon", "row_icon_primary_secondary_metaTwoLineIcon", "getRow_icon_primary_secondary_metaTwoLineIcon", "pogRows", "", "pogRows$lib_compose_bento_externalRelease", "()[Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "everything", "", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BaseRowPreviewState {
    public static final int $stable = 0;
    private static final String cta = "Text CTA";
    private static final ServerToBentoAssetMapper2 icon12;
    private static final ServerToBentoAssetMapper2 icon16;
    private static final String m = "Metadata";
    private static final String m2 = "Meta metadata";
    private static final String mLong = "This is an extremely long string that is going to go into the metafield and show how the views get adjusted to the side";
    private static final BentoBaseRowState.Meta.SingleLine metaSingleLine;
    private static final BentoBaseRowState.Meta.SingleLine metaSingleLineLong;
    private static final BentoBaseRowState.Meta.TwoLine metaTwoline;
    private static final BentoBaseRowState.Meta.TwoLineAndIcon metaTwolineIcon;
    private static final String p = "Primary information";
    private static final BentoBaseRowState row_primary;
    private static final BentoBaseRowState row_primary_loading;
    private static final String s = "Secondary information";
    public static final BaseRowPreviewState INSTANCE = new BaseRowPreviewState();
    private static final ServerToBentoAssetMapper2 icon24 = ServerToBentoAssetMapper2.INFO_24;

    private BaseRowPreviewState() {
    }

    static {
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.INFO_16;
        icon16 = serverToBentoAssetMapper2;
        icon12 = ServerToBentoAssetMapper2.LIGHTNING_12;
        metaSingleLine = new BentoBaseRowState.Meta.SingleLine(m);
        metaSingleLineLong = new BentoBaseRowState.Meta.SingleLine(mLong);
        metaTwoline = new BentoBaseRowState.Meta.TwoLine(m, m2);
        metaTwolineIcon = new BentoBaseRowState.Meta.TwoLineAndIcon(new AnnotatedString(m, null, 2, null), new AnnotatedString(m2, null, 2, null), serverToBentoAssetMapper2, "", null, null, 48, null);
        row_primary = new BentoBaseRowState((BentoBaseRowState.Start) null, p, (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (DefaultConstructorMarker) null);
        row_primary_loading = new BentoBaseRowState((BentoBaseRowState.Start) null, p, (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, true, 125, (DefaultConstructorMarker) null);
    }

    @JvmName
    private final BentoBaseRowState.Start.Icon getStart(Composer composer, int i) {
        composer.startReplaceGroup(-1089662076);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1089662076, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-start> (BentoBaseRow.kt:1112)");
        }
        BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(icon24, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, 6).m21368getAccent0d7_KjU()), 2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return icon;
    }

    @JvmName
    private final BentoBaseRowState.Start.Icon getLayeredIconStart(Composer composer, int i) {
        composer.startReplaceGroup(-125058718);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-125058718, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-layeredIconStart> (BentoBaseRow.kt:1118)");
        }
        BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(icon24, new BentoBaseRowState.Start.Icon.LayeredAsset(icon12, null, 2, null), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, 6).m21368getAccent0d7_KjU()), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return icon;
    }

    @JvmName
    private final BentoBaseRowState.Meta.Icon getMetaIcon(Composer composer, int i) {
        composer.startReplaceGroup(-1666017556);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1666017556, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-metaIcon> (BentoBaseRow.kt:1128)");
        }
        BentoBaseRowState.Meta.Icon icon = new BentoBaseRowState.Meta.Icon(icon24, "", Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, 6).m21368getAccent0d7_KjU()), (Function0) null, 8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return icon;
    }

    @JvmName
    private final BentoBaseRowState.Meta.SingleLineAndIcon getMetaSingleAndIcon(Composer composer, int i) {
        composer.startReplaceGroup(1737240801);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1737240801, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-metaSingleAndIcon> (BentoBaseRow.kt:1134)");
        }
        BentoBaseRowState.Meta.SingleLineAndIcon singleLineAndIcon = new BentoBaseRowState.Meta.SingleLineAndIcon(m, icon16, "", Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, 6).m21368getAccent0d7_KjU()), (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return singleLineAndIcon;
    }

    @JvmName
    private final BentoBaseRowState.Meta.CallToAction getMetaCta(Composer composer, int i) {
        composer.startReplaceGroup(-47639558);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-47639558, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-metaCta> (BentoBaseRow.kt:1150)");
        }
        BentoBaseRowState.Meta.CallToAction callToAction = new BentoBaseRowState.Meta.CallToAction(cta, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, 6).m21368getAccent0d7_KjU()), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return callToAction;
    }

    public final BentoBaseRowState getRow_primary$lib_compose_bento_externalRelease() {
        return row_primary;
    }

    public final BentoBaseRowState getRow_primary_loading$lib_compose_bento_externalRelease() {
        return row_primary_loading;
    }

    @JvmName
    public final BentoBaseRowState getRow_icon_primary_metaSingle(Composer composer, int i) {
        composer.startReplaceGroup(-1286841877);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1286841877, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-row_icon_primary_metaSingle> (BentoBaseRow.kt:1156)");
        }
        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) getStart(composer, i & 14), p, (String) null, (String) null, (BentoBaseRowState.Meta) metaSingleLine, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoBaseRowState;
    }

    @JvmName
    public final BentoBaseRowState getRow_layered_icon_primary_metaSingle(Composer composer, int i) {
        composer.startReplaceGroup(893156173);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(893156173, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-row_layered_icon_primary_metaSingle> (BentoBaseRow.kt:1162)");
        }
        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) getLayeredIconStart(composer, i & 14), p, (String) null, (String) null, (BentoBaseRowState.Meta) metaSingleLine, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoBaseRowState;
    }

    @JvmName
    public final BentoBaseRowState getRow_icon_primary_secondary(Composer composer, int i) {
        composer.startReplaceGroup(-467372597);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-467372597, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-row_icon_primary_secondary> (BentoBaseRow.kt:1169)");
        }
        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) getStart(composer, i & 14), p, s, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoBaseRowState;
    }

    @JvmName
    public final BentoBaseRowState getRow_icon_primary_secondary_metaSingleLine(Composer composer, int i) {
        composer.startReplaceGroup(1563118121);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1563118121, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-row_icon_primary_secondary_metaSingleLine> (BentoBaseRow.kt:1172)");
        }
        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) getStart(composer, i & 14), p, s, (String) null, (BentoBaseRowState.Meta) metaSingleLine, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoBaseRowState;
    }

    @JvmName
    public final BentoBaseRowState getRow_icon_primary_secondary_metaTwoLine(Composer composer, int i) {
        composer.startReplaceGroup(-574162997);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-574162997, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-row_icon_primary_secondary_metaTwoLine> (BentoBaseRow.kt:1175)");
        }
        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) getStart(composer, i & 14), p, s, (String) null, (BentoBaseRowState.Meta) metaTwoline, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoBaseRowState;
    }

    @JvmName
    public final BentoBaseRowState getRow_icon_primary_secondary_metaSingleLineAndIcon(Composer composer, int i) {
        composer.startReplaceGroup(1326640523);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1326640523, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-row_icon_primary_secondary_metaSingleLineAndIcon> (BentoBaseRow.kt:1178)");
        }
        int i2 = i & 14;
        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) getStart(composer, i2), p, s, (String) null, (BentoBaseRowState.Meta) getMetaSingleAndIcon(composer, i2), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoBaseRowState;
    }

    @JvmName
    public final BentoBaseRowState getRow_icon_primary_secondary_metaSingleLineLong(Composer composer, int i) {
        composer.startReplaceGroup(-960948767);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-960948767, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-row_icon_primary_secondary_metaSingleLineLong> (BentoBaseRow.kt:1186)");
        }
        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) getStart(composer, i & 14), p, s, (String) null, (BentoBaseRowState.Meta) metaSingleLineLong, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoBaseRowState;
    }

    @JvmName
    public final BentoBaseRowState getRow_icon_primary_metaTwoLine(Composer composer, int i) {
        composer.startReplaceGroup(-1011236629);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1011236629, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-row_icon_primary_metaTwoLine> (BentoBaseRow.kt:1194)");
        }
        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) getStart(composer, i & 14), p, (String) null, (String) null, (BentoBaseRowState.Meta) metaTwoline, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoBaseRowState;
    }

    @JvmName
    public final BentoBaseRowState getRow_icon_primary_secondary_metaCTA(Composer composer, int i) {
        composer.startReplaceGroup(1727842635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1727842635, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-row_icon_primary_secondary_metaCTA> (BentoBaseRow.kt:1197)");
        }
        int i2 = i & 14;
        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) getStart(composer, i2), p, s, (String) null, (BentoBaseRowState.Meta) getMetaCta(composer, i2), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoBaseRowState;
    }

    @JvmName
    public final BentoBaseRowState getRow_icon_primary_secondary_metaIcon(Composer composer, int i) {
        composer.startReplaceGroup(1274545571);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1274545571, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-row_icon_primary_secondary_metaIcon> (BentoBaseRow.kt:1200)");
        }
        int i2 = i & 14;
        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) getStart(composer, i2), p, s, (String) null, (BentoBaseRowState.Meta) getMetaIcon(composer, i2), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoBaseRowState;
    }

    @JvmName
    public final BentoBaseRowState getRow_icon_primary_secondary_metaTwoLineIcon(Composer composer, int i) {
        composer.startReplaceGroup(-40140245);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-40140245, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.<get-row_icon_primary_secondary_metaTwoLineIcon> (BentoBaseRow.kt:1203)");
        }
        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) getStart(composer, i & 14), p, s, (String) null, (BentoBaseRowState.Meta) metaTwolineIcon, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoBaseRowState;
    }

    public final BentoBaseRowState[] pogRows$lib_compose_bento_externalRelease() {
        BentoBaseRowState.Start.NumberPog numberPog = new BentoBaseRowState.Start.NumberPog(1);
        BentoBaseRowState.Start.PictogramPog pictogramPog = new BentoBaseRowState.Start.PictogramPog(ServerToBentoAssetMapper3.MEGAPHONE, null, null, 6, null);
        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) numberPog, p, s, (String) null, (BentoBaseRowState.Meta) metaTwoline, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, (DefaultConstructorMarker) null);
        BentoBaseRowState bentoBaseRowStateCopy$default = BentoBaseRowState.copy$default(bentoBaseRowState, null, null, null, null, null, false, false, 95, null);
        BentoBaseRowState bentoBaseRowStateCopy$default2 = BentoBaseRowState.copy$default(bentoBaseRowState, pictogramPog, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        return new BentoBaseRowState[]{bentoBaseRowState, bentoBaseRowStateCopy$default2, bentoBaseRowStateCopy$default, BentoBaseRowState.copy$default(bentoBaseRowStateCopy$default2, null, null, null, null, null, false, false, 95, null)};
    }

    public final List<BentoBaseRowState> everything(Composer composer, int i) {
        composer.startReplaceGroup(1808716365);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1808716365, i, -1, "com.robinhood.compose.bento.component.rows.BaseRowPreviewState.everything (BentoBaseRow.kt:1224)");
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(11);
        spreadBuilder.add(row_primary);
        int i2 = i & 14;
        spreadBuilder.add(getRow_icon_primary_metaSingle(composer, i2));
        spreadBuilder.add(getRow_icon_primary_secondary(composer, i2));
        spreadBuilder.add(getRow_icon_primary_secondary_metaSingleLine(composer, i2));
        spreadBuilder.add(getRow_icon_primary_secondary_metaTwoLine(composer, i2));
        spreadBuilder.add(getRow_icon_primary_secondary_metaSingleLineAndIcon(composer, i2));
        spreadBuilder.add(getRow_icon_primary_secondary_metaSingleLineLong(composer, i2));
        spreadBuilder.add(getRow_icon_primary_metaTwoLine(composer, i2));
        spreadBuilder.add(getRow_icon_primary_secondary_metaCTA(composer, i2));
        spreadBuilder.add(getRow_icon_primary_secondary_metaIcon(composer, i2));
        spreadBuilder.addSpread(pogRows$lib_compose_bento_externalRelease());
        List<BentoBaseRowState> listListOf = CollectionsKt.listOf(spreadBuilder.toArray(new BentoBaseRowState[spreadBuilder.size()]));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listListOf;
    }
}
