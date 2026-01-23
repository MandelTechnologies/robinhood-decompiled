package com.robinhood.android.rhyrewards.p246ui;

import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.android.rhyrewards.p246ui.CashCardOffer;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.api.pluto.ApiMerchantOfferV2;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;

/* compiled from: CashCardOfferComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00112\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, m3636d2 = {"j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/rhyrewards/ui/CashCardOffer;", "offer", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "eventDescriptor", "CashCardOfferComposable", "(Lj$/time/Clock;Lcom/robinhood/android/rhyrewards/ui/CashCardOffer;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Landroidx/compose/runtime/Composer;II)V", "", "text", "StandardHeader", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "MerchantOfferHeader", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)Lkotlin/Unit;", CashCardOfferComposable.HeaderPillTestTag, "Ljava/lang/String;", CashCardOfferComposable.HeaderTestTag, CashCardOfferComposable.ExpirationTestTag, CashCardOfferComposable.ImageTestTag, "Landroidx/compose/ui/unit/Dp;", "LogoDiameter", "F", "CardWith", "CardHeight", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rhyrewards.ui.CashCardOfferComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class CashCardOfferComposable {
    public static final String ExpirationTestTag = "ExpirationTestTag";
    public static final String HeaderPillTestTag = "HeaderPillTestTag";
    public static final String HeaderTestTag = "HeaderTestTag";
    public static final String ImageTestTag = "ImageTestTag";
    private static final float LogoDiameter = C2002Dp.m7995constructorimpl(40);
    private static final float CardWith = C2002Dp.m7995constructorimpl(150);
    private static final float CardHeight = C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CashCardOfferComposable$lambda$0(Clock clock, CashCardOffer cashCardOffer, Function0 function0, Modifier modifier, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, int i2, Composer composer, int i3) {
        CashCardOfferComposable(clock, cashCardOffer, function0, modifier, userInteractionEventDescriptor, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StandardHeader$lambda$2(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StandardHeader(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CashCardOfferComposable(final Clock clock, final CashCardOffer offer, final Function0<Unit> onClick, Modifier modifier, UserInteractionEventDescriptor userInteractionEventDescriptor, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        UserInteractionEventDescriptor userInteractionEventDescriptor2;
        final UserInteractionEventDescriptor userInteractionEventDescriptor3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(offer, "offer");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2092499931);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(clock) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(offer) : composerStartRestartGroup.changedInstance(offer) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    i3 |= composerStartRestartGroup.changedInstance(userInteractionEventDescriptor2) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    userInteractionEventDescriptor3 = userInteractionEventDescriptor2;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    UserInteractionEventDescriptor userInteractionEventDescriptor4 = i4 == 0 ? null : userInteractionEventDescriptor2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2092499931, i3, -1, "com.robinhood.android.rhyrewards.ui.CashCardOfferComposable (CashCardOfferComposable.kt:50)");
                    }
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifier4, CardWith), CardHeight), true, null, null, onClick, 6, null), userInteractionEventDescriptor4, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                    UserInteractionEventDescriptor userInteractionEventDescriptor5 = userInteractionEventDescriptor4;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifier5 = modifier4;
                    CardKt.m5548CardFjzlyU(modifierAutoLogEvents$default, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), 0L, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU()), C2002Dp.m7995constructorimpl(0), ComposableLambda3.rememberComposableLambda(726917208, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.CashCardOfferComposableKt.CashCardOfferComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            BentoTheme bentoTheme2;
                            BoxScopeInstance boxScopeInstance;
                            CashCardOffer cashCardOffer;
                            Modifier.Companion companion;
                            Clock clock2;
                            int i8;
                            Composer composer3;
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(726917208, i7, -1, "com.robinhood.android.rhyrewards.ui.CashCardOfferComposable.<anonymous> (CashCardOfferComposable.kt:64)");
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion2, bentoTheme3.getSpacing(composer2, i9).m21590getDefaultD9Ej5fM());
                            CashCardOffer cashCardOffer2 = offer;
                            Clock clock3 = clock;
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer2, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion2);
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            if (cashCardOffer2 instanceof CashCardOffer.RhyReferral) {
                                composer2.startReplaceGroup(1405906347);
                                CashCardOfferComposable.StandardHeader(StringResource2.getString(((CashCardOffer.RhyReferral) cashCardOffer2).getHeader(), composer2, StringResource.$stable), null, composer2, 0, 2);
                                composer2.endReplaceGroup();
                                Unit unit = Unit.INSTANCE;
                            } else {
                                if (!(cashCardOffer2 instanceof CashCardOffer.Merchant)) {
                                    composer2.startReplaceGroup(1405904486);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(1405909308);
                                CashCardOfferComposable.MerchantOfferHeader(((CashCardOffer.Merchant) cashCardOffer2).getOffer(), null, composer2, 0, 2);
                                composer2.endReplaceGroup();
                            }
                            StringResource title = cashCardOffer2.getTitle();
                            composer2.startReplaceGroup(1405911826);
                            if (title == null) {
                                bentoTheme2 = bentoTheme3;
                                i8 = i9;
                                boxScopeInstance = boxScopeInstance2;
                                cashCardOffer = cashCardOffer2;
                                companion = companion2;
                                clock2 = clock3;
                            } else {
                                bentoTheme2 = bentoTheme3;
                                boxScopeInstance = boxScopeInstance2;
                                cashCardOffer = cashCardOffer2;
                                companion = companion2;
                                clock2 = clock3;
                                i8 = i9;
                                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(title, composer2, StringResource.$stable), PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme3.getSpacing(composer2, i9).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i9).getTextM(), composer2, 0, 0, 8188);
                                Unit unit2 = Unit.INSTANCE;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
                            BentoTheme bentoTheme4 = bentoTheme2;
                            int i10 = i8;
                            final CashCardOffer cashCardOffer3 = cashCardOffer;
                            int i11 = i8;
                            CardKt.m5548CardFjzlyU(TestTag3.testTag(boxScopeInstance3.align(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion, CashCardOfferComposable.LogoDiameter), CashCardOfferComposable.LogoDiameter), companion3.getBottomStart()), CashCardOfferComposable.ImageTestTag), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme4.getSpacing(composer2, i10).m21593getSmallD9Ej5fM()), bentoTheme4.getColors(composer2, i10).m21371getBg0d7_KjU(), 0L, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme4.getColors(composer2, i10).m21373getBg30d7_KjU()), C2002Dp.m7995constructorimpl(0), ComposableLambda3.rememberComposableLambda(-412513393, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.CashCardOfferComposableKt$CashCardOfferComposable$1$1$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i12) {
                                    Composer composer5;
                                    if ((i12 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-412513393, i12, -1, "com.robinhood.android.rhyrewards.ui.CashCardOfferComposable.<anonymous>.<anonymous>.<anonymous> (CashCardOfferComposable.kt:91)");
                                    }
                                    Integer logoResource = cashCardOffer3.getLogoResource();
                                    composer4.startReplaceGroup(-1288377270);
                                    Painter painterPainterResource = logoResource == null ? null : PainterResources_androidKt.painterResource(logoResource.intValue(), composer4, 0);
                                    composer4.endReplaceGroup();
                                    composer4.startReplaceGroup(-1288377805);
                                    if (painterPainterResource == null) {
                                        StringResource logoUrl = cashCardOffer3.getLogoUrl();
                                        composer4.startReplaceGroup(-1288374086);
                                        String string2 = logoUrl != null ? StringResource2.getString(logoUrl, composer4, StringResource.$stable) : null;
                                        composer4.endReplaceGroup();
                                        composer5 = composer4;
                                        painterPainterResource = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(string2, null, null, null, 0, null, composer5, 0, 62);
                                    } else {
                                        composer5 = composer4;
                                    }
                                    Painter painter = painterPainterResource;
                                    composer5.endReplaceGroup();
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme5 = BentoTheme.INSTANCE;
                                    int i13 = BentoTheme.$stable;
                                    ImageKt.Image(painter, (String) null, Clip.clip(PaddingKt.m5142padding3ABfNKs(companion5, bentoTheme5.getSpacing(composer5, i13).m21595getXsmallD9Ej5fM()), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme5.getSpacing(composer5, i13).m21595getXsmallD9Ej5fM())), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, 48, 120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 1769472, 8);
                            StringResource stringResourceExpiration = cashCardOffer.expiration(clock2);
                            composer2.startReplaceGroup(424954875);
                            if (stringResourceExpiration == null) {
                                composer3 = composer2;
                            } else {
                                Modifier modifierTestTag = TestTag3.testTag(boxScopeInstance3.align(companion, companion3.getBottomEnd()), CashCardOfferComposable.ExpirationTestTag);
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer2, 48);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierTestTag);
                                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor3);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                composer3 = composer2;
                                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(stringResourceExpiration, composer2, StringResource.$stable), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme4.getSpacing(composer2, i11).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(bentoTheme4.getColors(composer2, i11).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer2, i11).getTextS(), composer3, 0, 0, 8184);
                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CLOCK_16), null, bentoTheme4.getColors(composer3, i11).m21426getFg20d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                                composer3.endNode();
                                Unit unit3 = Unit.INSTANCE;
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 1769472, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    userInteractionEventDescriptor3 = userInteractionEventDescriptor5;
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyrewards.ui.CashCardOfferComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CashCardOfferComposable.CashCardOfferComposable$lambda$0(clock, offer, onClick, modifier3, userInteractionEventDescriptor3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            userInteractionEventDescriptor2 = userInteractionEventDescriptor;
            if ((i3 & 9363) == 9362) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifier4, CardWith), CardHeight), true, null, null, onClick, 6, null), userInteractionEventDescriptor4, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                UserInteractionEventDescriptor userInteractionEventDescriptor52 = userInteractionEventDescriptor4;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifier52 = modifier4;
                CardKt.m5548CardFjzlyU(modifierAutoLogEvents$default2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), 0L, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU()), C2002Dp.m7995constructorimpl(0), ComposableLambda3.rememberComposableLambda(726917208, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.CashCardOfferComposableKt.CashCardOfferComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        BentoTheme bentoTheme22;
                        BoxScopeInstance boxScopeInstance;
                        CashCardOffer cashCardOffer;
                        Modifier.Companion companion;
                        Clock clock2;
                        int i8;
                        Composer composer3;
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(726917208, i7, -1, "com.robinhood.android.rhyrewards.ui.CashCardOfferComposable.<anonymous> (CashCardOfferComposable.kt:64)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion2, bentoTheme3.getSpacing(composer2, i9).m21590getDefaultD9Ej5fM());
                        CashCardOffer cashCardOffer2 = offer;
                        Clock clock3 = clock;
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer2, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion2);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        if (cashCardOffer2 instanceof CashCardOffer.RhyReferral) {
                            composer2.startReplaceGroup(1405906347);
                            CashCardOfferComposable.StandardHeader(StringResource2.getString(((CashCardOffer.RhyReferral) cashCardOffer2).getHeader(), composer2, StringResource.$stable), null, composer2, 0, 2);
                            composer2.endReplaceGroup();
                            Unit unit = Unit.INSTANCE;
                        } else {
                            if (!(cashCardOffer2 instanceof CashCardOffer.Merchant)) {
                                composer2.startReplaceGroup(1405904486);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(1405909308);
                            CashCardOfferComposable.MerchantOfferHeader(((CashCardOffer.Merchant) cashCardOffer2).getOffer(), null, composer2, 0, 2);
                            composer2.endReplaceGroup();
                        }
                        StringResource title = cashCardOffer2.getTitle();
                        composer2.startReplaceGroup(1405911826);
                        if (title == null) {
                            bentoTheme22 = bentoTheme3;
                            i8 = i9;
                            boxScopeInstance = boxScopeInstance2;
                            cashCardOffer = cashCardOffer2;
                            companion = companion2;
                            clock2 = clock3;
                        } else {
                            bentoTheme22 = bentoTheme3;
                            boxScopeInstance = boxScopeInstance2;
                            cashCardOffer = cashCardOffer2;
                            companion = companion2;
                            clock2 = clock3;
                            i8 = i9;
                            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(title, composer2, StringResource.$stable), PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme3.getSpacing(composer2, i9).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i9).getTextM(), composer2, 0, 0, 8188);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
                        BentoTheme bentoTheme4 = bentoTheme22;
                        int i10 = i8;
                        final CashCardOffer cashCardOffer3 = cashCardOffer;
                        int i11 = i8;
                        CardKt.m5548CardFjzlyU(TestTag3.testTag(boxScopeInstance3.align(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion, CashCardOfferComposable.LogoDiameter), CashCardOfferComposable.LogoDiameter), companion3.getBottomStart()), CashCardOfferComposable.ImageTestTag), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme4.getSpacing(composer2, i10).m21593getSmallD9Ej5fM()), bentoTheme4.getColors(composer2, i10).m21371getBg0d7_KjU(), 0L, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme4.getColors(composer2, i10).m21373getBg30d7_KjU()), C2002Dp.m7995constructorimpl(0), ComposableLambda3.rememberComposableLambda(-412513393, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.CashCardOfferComposableKt$CashCardOfferComposable$1$1$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i12) {
                                Composer composer5;
                                if ((i12 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-412513393, i12, -1, "com.robinhood.android.rhyrewards.ui.CashCardOfferComposable.<anonymous>.<anonymous>.<anonymous> (CashCardOfferComposable.kt:91)");
                                }
                                Integer logoResource = cashCardOffer3.getLogoResource();
                                composer4.startReplaceGroup(-1288377270);
                                Painter painterPainterResource = logoResource == null ? null : PainterResources_androidKt.painterResource(logoResource.intValue(), composer4, 0);
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(-1288377805);
                                if (painterPainterResource == null) {
                                    StringResource logoUrl = cashCardOffer3.getLogoUrl();
                                    composer4.startReplaceGroup(-1288374086);
                                    String string2 = logoUrl != null ? StringResource2.getString(logoUrl, composer4, StringResource.$stable) : null;
                                    composer4.endReplaceGroup();
                                    composer5 = composer4;
                                    painterPainterResource = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(string2, null, null, null, 0, null, composer5, 0, 62);
                                } else {
                                    composer5 = composer4;
                                }
                                Painter painter = painterPainterResource;
                                composer5.endReplaceGroup();
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                BentoTheme bentoTheme5 = BentoTheme.INSTANCE;
                                int i13 = BentoTheme.$stable;
                                ImageKt.Image(painter, (String) null, Clip.clip(PaddingKt.m5142padding3ABfNKs(companion5, bentoTheme5.getSpacing(composer5, i13).m21595getXsmallD9Ej5fM()), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme5.getSpacing(composer5, i13).m21595getXsmallD9Ej5fM())), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, 48, 120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 1769472, 8);
                        StringResource stringResourceExpiration = cashCardOffer.expiration(clock2);
                        composer2.startReplaceGroup(424954875);
                        if (stringResourceExpiration == null) {
                            composer3 = composer2;
                        } else {
                            Modifier modifierTestTag = TestTag3.testTag(boxScopeInstance3.align(companion, companion3.getBottomEnd()), CashCardOfferComposable.ExpirationTestTag);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer2, 48);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierTestTag);
                            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            composer3 = composer2;
                            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(stringResourceExpiration, composer2, StringResource.$stable), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme4.getSpacing(composer2, i11).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(bentoTheme4.getColors(composer2, i11).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer2, i11).getTextS(), composer3, 0, 0, 8184);
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CLOCK_16), null, bentoTheme4.getColors(composer3, i11).m21426getFg20d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                            composer3.endNode();
                            Unit unit3 = Unit.INSTANCE;
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1769472, 8);
                if (ComposerKt.isTraceInProgress()) {
                }
                userInteractionEventDescriptor3 = userInteractionEventDescriptor52;
                modifier3 = modifier52;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        userInteractionEventDescriptor2 = userInteractionEventDescriptor;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StandardHeader(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-943437445);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-943437445, i3, -1, "com.robinhood.android.rhyrewards.ui.StandardHeader (CashCardOfferComposable.kt:127)");
                }
                Modifier modifierTestTag = TestTag3.testTag(modifier3, HeaderTestTag);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(str, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), composerStartRestartGroup, (i3 & 14) | 24576, 0, 8174);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyrewards.ui.CashCardOfferComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CashCardOfferComposable.StandardHeader$lambda$2(str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierTestTag2 = TestTag3.testTag(modifier3, HeaderTestTag);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(str, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), composerStartRestartGroup, (i3 & 14) | 24576, 0, 8174);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MerchantOfferHeader(MerchantOfferV2 merchantOfferV2, Modifier modifier, Composer composer, int i, int i2) {
        BentoIcon4 bentoIcon;
        ServerToBentoAssetMapper2 asset;
        composer.startReplaceGroup(821586933);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(821586933, i, -1, "com.robinhood.android.rhyrewards.ui.MerchantOfferHeader (CashCardOfferComposable.kt:141)");
        }
        ApiMerchantOfferV2.Header header = merchantOfferV2.getHeader();
        Unit unit = null;
        if (header != null) {
            if (header.is_pill()) {
                composer.startReplaceGroup(-43906008);
                Modifier modifierTestTag = TestTag3.testTag(modifier2, HeaderPillTestTag);
                Integer numValueOf = null;
                String text = header.getText();
                Icon icon = header.getIcon();
                if (icon != null && (bentoIcon = SduiIcon2.toBentoIcon(icon)) != null && (asset = bentoIcon.getAsset()) != null) {
                    numValueOf = Integer.valueOf(asset.getResourceId());
                }
                InfoTagsKt.m20826BentoInlineInfoTagyZUFuyM(text, modifierTestTag, numValueOf, null, false, null, null, composer, 1572864, 56);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-43660643);
                Modifier modifierTestTag2 = TestTag3.testTag(modifier2, HeaderTestTag);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierTestTag2);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Icon icon2 = header.getIcon();
                BentoIcon4 bentoIcon2 = icon2 != null ? SduiIcon2.toBentoIcon(icon2) : null;
                composer.startReplaceGroup(-1640432643);
                if (bentoIcon2 != null) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    BentoIcon2.m20644BentoIconFU0evQE(bentoIcon2, null, bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21597getXxsmallD9Ej5fM(), 0.0f, 11, null), null, false, composer, BentoIcon4.$stable | 48, 48);
                }
                composer.endReplaceGroup();
                BentoText2.m20747BentoText38GnDrw(header.getText(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), composer, 24576, 0, 8174);
                composer.endNode();
                composer.endReplaceGroup();
            }
            unit = Unit.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return unit;
    }
}
