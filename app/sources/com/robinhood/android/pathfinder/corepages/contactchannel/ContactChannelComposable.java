package com.robinhood.android.pathfinder.corepages.contactchannel;

import android.net.Uri;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposable;
import com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelViewState;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContactChannelComposable.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0002\u0010\u000e\u001a1\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u001a\u001a\u0014\u0010\u001b\u001a\u00020\u0006*\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¨\u0006\u001d"}, m3636d2 = {"ContactChannelComposable", "", "state", "Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState;", "onClickChannel", "Lkotlin/Function1;", "", "(Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Title", "text", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Banner", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState$ContactChannelBanner;", "(Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState$ContactChannelBanner;Landroidx/compose/runtime/Composer;I)V", "Channel", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "channel", "Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState$ChannelItem;", "onClick", "(ILcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState$ChannelItem;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Disclosure", "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "(Lcom/robinhood/models/serverdriven/experimental/api/RichText;Landroidx/compose/runtime/Composer;I)V", "ContactChannelComposablePreview", "(Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState;Landroidx/compose/runtime/Composer;I)V", "indexed", "Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelTestTag;", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ContactChannelComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Banner$lambda$4(ContactChannelViewState.ContactChannelBanner contactChannelBanner, int i, Composer composer, int i2) {
        Banner(contactChannelBanner, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Banner$lambda$5(ContactChannelViewState.ContactChannelBanner contactChannelBanner, int i, Composer composer, int i2) {
        Banner(contactChannelBanner, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Channel$lambda$9(int i, ContactChannelViewState.ChannelItem channelItem, Function1 function1, int i2, Composer composer, int i3) {
        Channel(i, channelItem, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactChannelComposable$lambda$2(ContactChannelViewState contactChannelViewState, Function1 function1, int i, Composer composer, int i2) {
        ContactChannelComposable(contactChannelViewState, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactChannelComposablePreview$lambda$14(ContactChannelViewState contactChannelViewState, int i, Composer composer, int i2) {
        ContactChannelComposablePreview(contactChannelViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Disclosure$lambda$10(RichText richText, int i, Composer composer, int i2) {
        Disclosure(richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Disclosure$lambda$13(RichText richText, int i, Composer composer, int i2) {
        Disclosure(richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$3(String str, int i, Composer composer, int i2) {
        Title(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ContactChannelComposable(final ContactChannelViewState state, final Function1<? super String, Unit> onClickChannel, Composer composer, final int i) {
        Modifier modifierTestTag;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClickChannel, "onClickChannel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1541767001);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickChannel) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1541767001, i2, -1, "com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposable (ContactChannelComposable.kt:38)");
            }
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 0.0f;
            Object obj = null;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(ScrollKt.verticalScroll$default(companion, scrollStateRememberScrollState, false, null, false, 14, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Title(state.getTitle(), composerStartRestartGroup, 0);
            Banner(state.getInfoBanner(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1699970897);
            final int i3 = 0;
            for (final ContactChannelViewState.ChannelItem channelItem : state.getChannelItems()) {
                int i4 = i3 + 1;
                float f2 = f;
                boolean showLoadingView = state.getShowLoadingView();
                if (state.getShowLoadingView()) {
                    modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "Loading");
                } else {
                    modifierTestTag = Modifier.INSTANCE;
                }
                LocalShowPlaceholder.Loadable(showLoadingView, modifierTestTag, null, ComposableLambda3.rememberComposableLambda(338057205, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposableKt$ContactChannelComposable$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1367306767, i5, -1, "com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposable.<anonymous>.<anonymous>.<anonymous> (ContactChannelComposable.kt:60)");
                        }
                        ContactChannelComposable.Channel(i3, channelItem, onClickChannel, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 4);
                i3 = i4;
                obj = obj;
                f = f2;
            }
            composerStartRestartGroup.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, 1, obj), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
            Disclosure(state.getDisclaimer(), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ContactChannelComposable.ContactChannelComposable$lambda$2(state, onClickChannel, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final void Title(final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2028189764);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2028189764, i2, -1, "com.robinhood.android.pathfinder.corepages.contactchannel.Title (ContactChannelComposable.kt:83)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "Title");
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, i2 & 14, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactChannelComposable.Title$lambda$3(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Banner(final ContactChannelViewState.ContactChannelBanner contactChannelBanner, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2090378998);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(contactChannelBanner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2090378998, i2, -1, "com.robinhood.android.pathfinder.corepages.contactchannel.Banner (ContactChannelComposable.kt:97)");
            }
            if (contactChannelBanner == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ContactChannelComposable.Banner$lambda$4(contactChannelBanner, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromResourceInt = ServerToBentoAssetMapper2.INSTANCE.fromResourceInt(contactChannelBanner.getInfoBannerIcon());
            BentoIcon4.Size24 size24 = serverToBentoAssetMapper2FromResourceInt != null ? new BentoIcon4.Size24(serverToBentoAssetMapper2FromResourceInt) : null;
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "Banner");
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(RichTexts2.m15956toAnnotatedStringiJQMabo(contactChannelBanner.getInfoBannerText(), 0L, composerStartRestartGroup, 0, 1), null, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21797getDefaultForeground0d7_KjU(), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21796getDefaultBackground0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), size24, null, null, composerStartRestartGroup, (BentoIcon4.Size24.$stable << 15) | 48, 192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactChannelComposable.Banner$lambda$5(contactChannelBanner, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Channel(final int i, final ContactChannelViewState.ChannelItem channelItem, final Function1<? super String, Unit> function1, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-467391552);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(channelItem) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-467391552, i4, -1, "com.robinhood.android.pathfinder.corepages.contactchannel.Channel (ContactChannelComposable.kt:118)");
            }
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromResourceInt = ServerToBentoAssetMapper2.INSTANCE.fromResourceInt(channelItem.getIcon());
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, indexed(ContactChannelComposable3.ChannelRow, i));
            AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo = RichTexts2.m15956toAnnotatedStringiJQMabo(channelItem.getPrimaryText(), 0L, composerStartRestartGroup, 0, 1);
            com.robinhood.models.serverdriven.p347db.RichText secondaryText = channelItem.getSecondaryText();
            composerStartRestartGroup.startReplaceGroup(1808297523);
            AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo2 = secondaryText == null ? null : RichTexts2.m15956toAnnotatedStringiJQMabo(secondaryText, 0L, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.endReplaceGroup();
            BentoBaseRowState.Start.Icon icon = serverToBentoAssetMapper2FromResourceInt != null ? new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2FromResourceInt, null, null, 6, null) : null;
            boolean zIsEnabled = channelItem.isEnabled();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = ((i4 & 896) == 256) | composerStartRestartGroup.changedInstance(channelItem);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ContactChannelComposable.Channel$lambda$8$lambda$7(function1, channelItem);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierTestTag, icon, annotatedStringM15956toAnnotatedStringiJQMabo, annotatedStringM15956toAnnotatedStringiJQMabo2, null, null, null, false, false, false, zIsEnabled, false, 0L, (Function0) objRememberedValue, composerStartRestartGroup, BentoBaseRowState.Start.Icon.$stable << 3, 0, 7152);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactChannelComposable.Channel$lambda$9(i, channelItem, function1, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Channel$lambda$8$lambda$7(Function1 function1, ContactChannelViewState.ChannelItem channelItem) {
        function1.invoke(channelItem.getId());
        return Unit.INSTANCE;
    }

    private static final void Disclosure(final RichText richText, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-690422461);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(richText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-690422461, i2, -1, "com.robinhood.android.pathfinder.corepages.contactchannel.Disclosure (ContactChannelComposable.kt:133)");
            }
            if (richText == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ContactChannelComposable.Disclosure$lambda$10(richText, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            final UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "Disclosure");
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 7, null);
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU();
            TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uriHandler);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ContactChannelComposable.Disclosure$lambda$12$lambda$11(uriHandler, (Uri) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoRichText.m15949BentoRichText0sCZWFg(richText, modifierM5146paddingqDBjuR0$default, textS, jM21426getFg20d7_KjU, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue, composerStartRestartGroup, i2 & 14, 496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactChannelComposable.Disclosure$lambda$13(richText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Disclosure$lambda$12$lambda$11(UriHandler uriHandler, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String string2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        uriHandler.openUri(string2);
        return Unit.INSTANCE;
    }

    /* compiled from: ContactChannelComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposableKt$ContactChannelComposablePreview$1 */
    static final class C252671 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ContactChannelViewState $state;

        C252671(ContactChannelViewState contactChannelViewState) {
            this.$state = contactChannelViewState;
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
                ComposerKt.traceEventStart(987001840, i, -1, "com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposablePreview.<anonymous> (ContactChannelComposable.kt:156)");
            }
            ContactChannelViewState contactChannelViewState = this.$state;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposableKt$ContactChannelComposablePreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ContactChannelComposable.C252671.invoke$lambda$1$lambda$0((String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ContactChannelComposable.ContactChannelComposable(contactChannelViewState, (Function1) objRememberedValue, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final void ContactChannelComposablePreview(final ContactChannelViewState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2013711816);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2013711816, i2, -1, "com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposablePreview (ContactChannelComposable.kt:154)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(987001840, true, new C252671(state), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactChannelComposable.ContactChannelComposablePreview$lambda$14(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final String indexed(ContactChannelComposable3 contactChannelComposable3, int i) {
        Intrinsics.checkNotNullParameter(contactChannelComposable3, "<this>");
        return contactChannelComposable3.name() + "_" + i;
    }
}
