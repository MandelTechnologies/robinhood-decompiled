package com.robinhood.android.newsfeed.breakingnews.p198ui;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.newsfeed.breakingnews.p198ui.BreakingNewsCard;
import com.robinhood.android.newsfeed.models.breakingnews.api.ApiAssetType;
import com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.BreakingNewsContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.time.android.format.DurationFormatter;
import com.robinhood.utils.datetime.Durations;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BreakingNewsCard.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"BreakingNewsCard", "", "breakingNews", "Lcom/robinhood/android/newsfeed/models/breakingnews/db/BreakingNews;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/newsfeed/models/breakingnews/db/BreakingNews;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-breakingnews-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class BreakingNewsCard {

    /* compiled from: BreakingNewsCard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAssetType.values().length];
            try {
                iArr[ApiAssetType.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAssetType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAssetType.INDEX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAssetType.EVENT_CONTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BreakingNewsCard$lambda$4(BreakingNews breakingNews, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BreakingNewsCard(breakingNews, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BreakingNewsCard(final BreakingNews breakingNews, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        int i4;
        Screen.Name name;
        Screen.Name name2;
        Screen screen;
        int i5;
        char c;
        Asset.AssetType assetType;
        String ctaUrl;
        boolean zChangedInstance;
        Object objRememberedValue2;
        long jM21372getBg20d7_KjU;
        Composer composer2;
        final BreakingNews breakingNews2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(breakingNews, "breakingNews");
        Composer composerStartRestartGroup = composer.startRestartGroup(127750064);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(breakingNews) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(127750064, i3, -1, "com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCard (BreakingNewsCard.kt:47)");
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM());
                ApiAssetType assetType2 = breakingNews.getAssetType();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                i4 = iArr[assetType2.ordinal()];
                if (i4 != 1) {
                    name = Screen.Name.CRYPTO_DETAIL_PAGE;
                } else if (i4 == 2) {
                    name = Screen.Name.STOCK_DETAIL_PAGE;
                } else if (i4 == 3) {
                    name = Screen.Name.INDEX_DETAIL;
                } else if (i4 != 4) {
                    name2 = null;
                    if (name2 != null) {
                        String string2 = breakingNews.getAssetId().toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        String string3 = breakingNews.getAssetId().toString();
                        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                        screen = new Screen(name2, string3, string2, null, 8, null);
                    } else {
                        screen = null;
                    }
                    Component.ComponentType componentType = Component.ComponentType.BREAKING_NEWS_BANNER;
                    String string4 = breakingNews.getAssetId().toString();
                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                    Component component = new Component(componentType, string4, null, 4, null);
                    String string5 = breakingNews.getAssetId().toString();
                    UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_NEWS_ARTICLE;
                    i5 = iArr[breakingNews.getAssetType().ordinal()];
                    if (i5 == 1) {
                        c = 4;
                        assetType = Asset.AssetType.CURRENCY_PAIR;
                    } else if (i5 == 2) {
                        c = 4;
                        assetType = Asset.AssetType.INSTRUMENT;
                    } else if (i5 != 3) {
                        c = 4;
                        assetType = i5 != 4 ? Asset.AssetType.ASSET_TYPE_UNSPECIFIED : Asset.AssetType.EVENT_CONTRACT;
                    } else {
                        c = 4;
                        assetType = Asset.AssetType.INDEXES;
                    }
                    Asset.AssetType assetType3 = assetType;
                    String string6 = breakingNews.getAssetId().toString();
                    Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                    Asset asset = new Asset(string6, assetType3, null, null, 12, null);
                    String string7 = breakingNews.getAssetId().toString();
                    Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                    String header = breakingNews.getHeader();
                    String text = breakingNews.getBody().getText();
                    ctaUrl = breakingNews.getCtaUrl();
                    if (ctaUrl == null) {
                        ctaUrl = "";
                    }
                    Modifier modifier4 = modifier3;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(modifier3, new UserInteractionEventDescriptor(string5, screen, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, asset, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BreakingNewsContext(header, text, ctaUrl, string7, null, 16, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -33554433, 16383, null), component, null, 32, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(breakingNews) | composerStartRestartGroup.changedInstance(context);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BreakingNewsCard.BreakingNewsCard$lambda$3$lambda$2(breakingNews, context);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierFillMaxWidth$default, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                    CardDefaults cardDefaults = CardDefaults.INSTANCE;
                    if (bentoTheme.getColors(composerStartRestartGroup, i7).getIsDay()) {
                        composerStartRestartGroup.startReplaceGroup(-1786137453);
                        jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21372getBg20d7_KjU();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1786138286);
                        jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i8 = CardDefaults.$stable;
                    composer2 = composerStartRestartGroup;
                    breakingNews2 = breakingNews;
                    CardKt.Card(modifierM4891clickableO2vRcR0$default, roundedCornerShapeM5327RoundedCornerShape0680j_4, cardDefaults.m5729cardColorsro_MJ88(jM21372getBg20d7_KjU, 0L, 0L, 0L, composerStartRestartGroup, i8 << 12, 14), cardDefaults.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i8 << 18) | 6, 62), BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i7).m21373getBg30d7_KjU()), ComposableLambda3.rememberComposableLambda(1245857442, true, new C225772(breakingNews2, context), composer2, 54), composer2, 196608, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                } else {
                    name = Screen.Name.EVENT_CONTRACT_DETAIL_PAGE;
                }
                name2 = name;
                if (name2 != null) {
                }
                Component.ComponentType componentType2 = Component.ComponentType.BREAKING_NEWS_BANNER;
                String string42 = breakingNews.getAssetId().toString();
                Intrinsics.checkNotNullExpressionValue(string42, "toString(...)");
                Component component2 = new Component(componentType2, string42, null, 4, null);
                String string52 = breakingNews.getAssetId().toString();
                UserInteractionEventData.Action action2 = UserInteractionEventData.Action.VIEW_NEWS_ARTICLE;
                i5 = iArr[breakingNews.getAssetType().ordinal()];
                if (i5 == 1) {
                }
                Asset.AssetType assetType32 = assetType;
                String string62 = breakingNews.getAssetId().toString();
                Intrinsics.checkNotNullExpressionValue(string62, "toString(...)");
                Asset asset2 = new Asset(string62, assetType32, null, null, 12, null);
                String string72 = breakingNews.getAssetId().toString();
                Intrinsics.checkNotNullExpressionValue(string72, "toString(...)");
                String header2 = breakingNews.getHeader();
                String text2 = breakingNews.getBody().getText();
                ctaUrl = breakingNews.getCtaUrl();
                if (ctaUrl == null) {
                }
                Modifier modifier42 = modifier3;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(modifier3, new UserInteractionEventDescriptor(string52, screen, action2, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, asset2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BreakingNewsContext(header2, text2, ctaUrl, string72, null, 16, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -33554433, 16383, null), component2, null, 32, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(breakingNews) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BreakingNewsCard.BreakingNewsCard$lambda$3$lambda$2(breakingNews, context);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifierFillMaxWidth$default2, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                    CardDefaults cardDefaults2 = CardDefaults.INSTANCE;
                    if (bentoTheme.getColors(composerStartRestartGroup, i7).getIsDay()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i82 = CardDefaults.$stable;
                    composer2 = composerStartRestartGroup;
                    breakingNews2 = breakingNews;
                    CardKt.Card(modifierM4891clickableO2vRcR0$default2, roundedCornerShapeM5327RoundedCornerShape0680j_4, cardDefaults2.m5729cardColorsro_MJ88(jM21372getBg20d7_KjU, 0L, 0L, 0L, composerStartRestartGroup, i82 << 12, 14), cardDefaults2.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i82 << 18) | 6, 62), BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i7).m21373getBg30d7_KjU()), ComposableLambda3.rememberComposableLambda(1245857442, true, new C225772(breakingNews2, context), composer2, 54), composer2, 196608, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                breakingNews2 = breakingNews;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BreakingNewsCard.BreakingNewsCard$lambda$4(breakingNews2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM());
            ApiAssetType assetType22 = breakingNews.getAssetType();
            int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
            i4 = iArr2[assetType22.ordinal()];
            if (i4 != 1) {
            }
            name2 = name;
            if (name2 != null) {
            }
            Component.ComponentType componentType22 = Component.ComponentType.BREAKING_NEWS_BANNER;
            String string422 = breakingNews.getAssetId().toString();
            Intrinsics.checkNotNullExpressionValue(string422, "toString(...)");
            Component component22 = new Component(componentType22, string422, null, 4, null);
            String string522 = breakingNews.getAssetId().toString();
            UserInteractionEventData.Action action22 = UserInteractionEventData.Action.VIEW_NEWS_ARTICLE;
            i5 = iArr2[breakingNews.getAssetType().ordinal()];
            if (i5 == 1) {
            }
            Asset.AssetType assetType322 = assetType;
            String string622 = breakingNews.getAssetId().toString();
            Intrinsics.checkNotNullExpressionValue(string622, "toString(...)");
            Asset asset22 = new Asset(string622, assetType322, null, null, 12, null);
            String string722 = breakingNews.getAssetId().toString();
            Intrinsics.checkNotNullExpressionValue(string722, "toString(...)");
            String header22 = breakingNews.getHeader();
            String text22 = breakingNews.getBody().getText();
            ctaUrl = breakingNews.getCtaUrl();
            if (ctaUrl == null) {
            }
            Modifier modifier422 = modifier3;
            Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(modifier3, new UserInteractionEventDescriptor(string522, screen, action22, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, asset22, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BreakingNewsContext(header22, text22, ctaUrl, string722, null, 16, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -33554433, 16383, null), component22, null, 32, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(breakingNews) | composerStartRestartGroup.changedInstance(context2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: BreakingNewsCard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardKt$BreakingNewsCard$2 */
    static final class C225772 implements Function3<Column5, Composer, Integer, Unit> {
        final /* synthetic */ BreakingNews $breakingNews;
        final /* synthetic */ Context $context;

        C225772(BreakingNews breakingNews, Context context) {
            this.$breakingNews = breakingNews;
            this.$context = context;
        }

        public final void invoke(Column5 Card, Composer composer, int i) {
            final BreakingNews breakingNews;
            Intrinsics.checkNotNullParameter(Card, "$this$Card");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1245857442, i, -1, "com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCard.<anonymous> (BreakingNewsCard.kt:120)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
            BreakingNews breakingNews2 = this.$breakingNews;
            final Context context = this.$context;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(breakingNews2.getIcon()), breakingNews2.getHeader(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size12.$stable, 56);
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM()), composer, 0);
            BentoText2.m20747BentoText38GnDrw(breakingNews2.getHeader(), null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 24576, 0, 8170);
            Spacer2.Spacer(Row5.weight$default(row6, companion, 1.0f, false, 2, null), composer, 0);
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            BentoText2.m20747BentoText38GnDrw(DurationFormatter.formatNarrow$default(resources, Durations.since(breakingNews2.getPublishedAt()), false, 4, null), null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8186);
            composer.endNode();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
            BentoRichText.m15949BentoRichText0sCZWFg(breakingNews2.getBody(), (Modifier) null, bentoTheme.getTypography(composer, i2).getTextM(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0L, false, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), 4, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composer, 14155776, 818);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default3);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            String ctaText = breakingNews2.getCtaText();
            composer.startReplaceGroup(-847370114);
            if (ctaText != null) {
                boolean z = breakingNews2.getCtaUrl() != null;
                composer.startReplaceGroup(-1633490746);
                breakingNews = breakingNews2;
                boolean zChangedInstance = composer.changedInstance(breakingNews) | composer.changedInstance(context);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardKt$BreakingNewsCard$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BreakingNewsCard.C225772.invoke$lambda$4$lambda$3$lambda$2$lambda$1(breakingNews, context);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, ctaText, null, null, null, z, null, composer, 0, 92);
                Spacer2.Spacer(Row5.weight$default(row6, companion, 1.0f, false, 2, null), composer, 0);
            } else {
                breakingNews = breakingNews2;
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(breakingNews.getFooter(), null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8186);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
            invoke(column5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(BreakingNews breakingNews, Context context) {
            if (breakingNews.getCtaUrl() != null) {
                WebUtils.viewUrl$default(context, breakingNews.getCtaUrl(), 0, 4, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BreakingNewsCard$lambda$3$lambda$2(BreakingNews breakingNews, Context context) {
        if (breakingNews.getCtaUrl() != null) {
            WebUtils.viewUrl$default(context, breakingNews.getCtaUrl(), 0, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
