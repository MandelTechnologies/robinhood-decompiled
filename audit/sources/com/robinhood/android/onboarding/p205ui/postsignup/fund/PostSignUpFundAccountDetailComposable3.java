package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.ValuePropWithIcon;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PostSignUpFundAccountDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001a[\u0010\u0012\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"PostSignUpFundAccountDetailComposable", "", "content", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailContent;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "onCtaClicked", "Lkotlin/Function0;", "onExitClicked", "modifier", "Landroidx/compose/ui/Modifier;", "onDisclosureLinkClicked", "Lkotlin/Function1;", "", "(Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailContent;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "BottomBarComposable", "buttonText", "exitButtonText", "disclosureText", "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/RichText;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class PostSignUpFundAccountDetailComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarComposable$lambda$6(String str, String str2, RichText richText, Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) {
        BottomBarComposable(str, str2, richText, function0, function02, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostSignUpFundAccountDetailComposable$lambda$0(PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent, Screen screen, Context context, Function0 function0, Function0 function02, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        PostSignUpFundAccountDetailComposable(postSignUpFundAccountDetailContent, screen, context, function0, function02, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PostSignUpFundAccountDetailComposable(final PostSignUpFundAccountDetailContent content, final Screen eventScreen, final Context context, final Function0<Unit> onCtaClicked, final Function0<Unit> onExitClicked, Modifier modifier, final Function1<? super String, Unit> onDisclosureLinkClicked, Composer composer, final int i, final int i2) {
        int i3;
        Context context2;
        int i4;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(onCtaClicked, "onCtaClicked");
        Intrinsics.checkNotNullParameter(onExitClicked, "onExitClicked");
        Intrinsics.checkNotNullParameter(onDisclosureLinkClicked, "onDisclosureLinkClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(690935083);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventScreen) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                context2 = context;
                i3 |= composerStartRestartGroup.changedInstance(context2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onCtaClicked) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onExitClicked) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onDisclosureLinkClicked) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(690935083, i3, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposable (PostSignUpFundAccountDetailComposable.kt:47)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifier4 = modifier2;
                    final Context context3 = context2;
                    composer2 = composerStartRestartGroup;
                    ScaffoldKt.m5625Scaffold27mzLpw(PaddingKt.m5146paddingqDBjuR0$default(modifier2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, PostSignUpFundAccountDetailComposable.INSTANCE.m16844getLambda$1768948624$feature_onboarding_externalDebug(), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(-1729899287, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposableKt.PostSignUpFundAccountDetailComposable.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final PaddingValues paddingValues, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i6 & 6) == 0) {
                                i6 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1729899287, i6, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposable.<anonymous> (PostSignUpFundAccountDetailComposable.kt:53)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, eventScreen, null, context3, null, null, 53, null);
                            final PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent = content;
                            final Function0<Unit> function0 = onCtaClicked;
                            final Function0<Unit> function02 = onExitClicked;
                            final Function1<String, Unit> function1 = onDisclosureLinkClicked;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-1826802924, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposableKt.PostSignUpFundAccountDetailComposable.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i7) {
                                    if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1826802924, i7, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposable.<anonymous>.<anonymous> (PostSignUpFundAccountDetailComposable.kt:59)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, (UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), 0.0f, 1, null), paddingValues);
                                    final PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent2 = postSignUpFundAccountDetailContent;
                                    final Function0<Unit> function03 = function0;
                                    final Function0<Unit> function04 = function02;
                                    final Function1<String, Unit> function12 = function1;
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1182600713, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposableKt.PostSignUpFundAccountDetailComposable.1.1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer5, Integer num) {
                                            invoke(bentoButtonBar3, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer5, int i8) {
                                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                            if ((i8 & 17) == 16 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1182600713, i8, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposable.<anonymous>.<anonymous>.<anonymous> (PostSignUpFundAccountDetailComposable.kt:68)");
                                            }
                                            PostSignUpFundAccountDetailComposable3.BottomBarComposable(postSignUpFundAccountDetailContent2.getButtonText(), postSignUpFundAccountDetailContent2.getExitButtonText(), postSignUpFundAccountDetailContent2.getDisclosureText(), function03, function04, function12, composer5, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54);
                                    final PaddingValues paddingValues2 = paddingValues;
                                    final PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent3 = postSignUpFundAccountDetailContent;
                                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierPadding, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(689645564, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposableKt.PostSignUpFundAccountDetailComposable.1.1.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer5, Integer num) {
                                            invoke(boxScope, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: Type inference failed for: r0v1 */
                                        /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
                                        /* JADX WARN: Type inference failed for: r0v9 */
                                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer5, int i8) {
                                            Modifier.Companion companion;
                                            PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent4;
                                            ?? r0;
                                            Modifier.Companion companion2;
                                            Composer composer6 = composer5;
                                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                            if ((i8 & 17) == 16 && composer6.getSkipping()) {
                                                composer6.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(689645564, i8, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposable.<anonymous>.<anonymous>.<anonymous> (PostSignUpFundAccountDetailComposable.kt:78)");
                                            }
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(companion3, paddingValues2), ScrollKt.rememberScrollState(0, composer6, 0, 1), false, null, false, 14, null);
                                            Alignment.Companion companion4 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                                            PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent5 = postSignUpFundAccountDetailContent3;
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer6, 48);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer6, modifierVerticalScroll$default);
                                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                            if (composer6.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor);
                                            } else {
                                                composer6.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer6);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            RichText title = postSignUpFundAccountDetailContent5.getTitle();
                                            composer6.startReplaceGroup(-174279741);
                                            if (title == null) {
                                                companion = companion3;
                                                postSignUpFundAccountDetailContent4 = postSignUpFundAccountDetailContent5;
                                                r0 = 0;
                                            } else {
                                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                                int i9 = BentoTheme.$stable;
                                                companion = companion3;
                                                postSignUpFundAccountDetailContent4 = postSignUpFundAccountDetailContent5;
                                                r0 = 0;
                                                BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15957toAnnotatedStringiJQMabo(title, 0L, composer6, 0, 1), PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme2.getSpacing(composer6, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer6, i9).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composer6, i9).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme2.getTypography(composer6, i9).getDisplayCapsuleSmall(), composer6, 0, 0, 8188);
                                                Unit unit = Unit.INSTANCE;
                                            }
                                            composer6.endReplaceGroup();
                                            String subtitleMarkdown = postSignUpFundAccountDetailContent4.getSubtitleMarkdown();
                                            composer6.startReplaceGroup(-174260023);
                                            if (subtitleMarkdown != null) {
                                                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                                int i10 = BentoTheme.$stable;
                                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme3.getSpacing(composer6, i10).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer6, i10).m21593getSmallD9Ej5fM(), bentoTheme3.getSpacing(composer6, i10).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), r0);
                                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer6, r0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer6, modifierM5146paddingqDBjuR0$default);
                                                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                                if (composer6.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer6.startReusableNode();
                                                if (composer6.getInserting()) {
                                                    composer6.createNode(constructor2);
                                                } else {
                                                    composer6.useNode();
                                                }
                                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer6);
                                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                BentoMarkdownText2.BentoMarkdownText(subtitleMarkdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme3.getTypography(composer6, i10).getTextM(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0L, 0L, false, composer6, BentoMarkdownText.$stable << 15, 28), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer5, MarkdownStyle.$stable << 6, 26);
                                                composer6 = composer5;
                                                composer6.endNode();
                                                Unit unit2 = Unit.INSTANCE;
                                            }
                                            composer6.endReplaceGroup();
                                            RichText subtitle = postSignUpFundAccountDetailContent4.getSubtitle();
                                            composer6.startReplaceGroup(-174232659);
                                            if (subtitle == null) {
                                                companion2 = companion;
                                            } else {
                                                BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                                                int i11 = BentoTheme.$stable;
                                                companion2 = companion;
                                                BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15957toAnnotatedStringiJQMabo(subtitle, 0L, composer6, 0, 1), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme4.getSpacing(composer6, i11).m21592getMediumD9Ej5fM(), bentoTheme4.getSpacing(composer6, i11).m21593getSmallD9Ej5fM(), bentoTheme4.getSpacing(composer6, i11).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, bentoTheme4.getTypography(composer6, i11).getTextM(), composer6, 0, 0, 8124);
                                                Unit unit3 = Unit.INSTANCE;
                                            }
                                            composer6.endReplaceGroup();
                                            List<ValuePropWithIcon<GenericAction>> valueProps = postSignUpFundAccountDetailContent4.getValueProps();
                                            composer6.startReplaceGroup(-174212444);
                                            if (valueProps != null) {
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composer6, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer6, 0);
                                                ImmutableList immutableList = extensions2.toImmutableList(valueProps);
                                                composer6.startReplaceGroup(-1772220517);
                                                SduiColumns.SduiColumn(immutableList, GenericAction.class, companion2, null, null, HorizontalPadding.Default, arrangement.getTop(), companion4.getStart(), false, composer6, 100663296, 0);
                                                composer5.endReplaceGroup();
                                                Unit unit4 = Unit.INSTANCE;
                                            }
                                            composer5.endReplaceGroup();
                                            composer5.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), composer4, 3456, 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 384, 12582912, 98298);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PostSignUpFundAccountDetailComposable3.PostSignUpFundAccountDetailComposable$lambda$0(content, eventScreen, context, onCtaClicked, onExitClicked, modifier3, onDisclosureLinkClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((i2 & 64) != 0) {
            }
            if ((599187 & i3) == 599186) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifier42 = modifier2;
                final Context context32 = context2;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5625Scaffold27mzLpw(PaddingKt.m5146paddingqDBjuR0$default(modifier2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, PostSignUpFundAccountDetailComposable.INSTANCE.m16844getLambda$1768948624$feature_onboarding_externalDebug(), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(-1729899287, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposableKt.PostSignUpFundAccountDetailComposable.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final PaddingValues paddingValues, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i6 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1729899287, i6, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposable.<anonymous> (PostSignUpFundAccountDetailComposable.kt:53)");
                        }
                        UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, eventScreen, null, context32, null, null, 53, null);
                        final PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent = content;
                        final Function0<Unit> function0 = onCtaClicked;
                        final Function0<Unit> function02 = onExitClicked;
                        final Function1<? super String, Unit> function1 = onDisclosureLinkClicked;
                        AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-1826802924, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposableKt.PostSignUpFundAccountDetailComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i7) {
                                if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1826802924, i7, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposable.<anonymous>.<anonymous> (PostSignUpFundAccountDetailComposable.kt:59)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, (UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), 0.0f, 1, null), paddingValues);
                                final PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent2 = postSignUpFundAccountDetailContent;
                                final Function0<Unit> function03 = function0;
                                final Function0<Unit> function04 = function02;
                                final Function1<? super String, Unit> function12 = function1;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1182600713, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposableKt.PostSignUpFundAccountDetailComposable.1.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer5, Integer num) {
                                        invoke(bentoButtonBar3, composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer5, int i8) {
                                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                        if ((i8 & 17) == 16 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1182600713, i8, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposable.<anonymous>.<anonymous>.<anonymous> (PostSignUpFundAccountDetailComposable.kt:68)");
                                        }
                                        PostSignUpFundAccountDetailComposable3.BottomBarComposable(postSignUpFundAccountDetailContent2.getButtonText(), postSignUpFundAccountDetailContent2.getExitButtonText(), postSignUpFundAccountDetailContent2.getDisclosureText(), function03, function04, function12, composer5, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54);
                                final PaddingValues paddingValues2 = paddingValues;
                                final PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent3 = postSignUpFundAccountDetailContent;
                                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierPadding, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(689645564, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposableKt.PostSignUpFundAccountDetailComposable.1.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer5, Integer num) {
                                        invoke(boxScope, composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1 */
                                    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
                                    /* JADX WARN: Type inference failed for: r0v9 */
                                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer5, int i8) {
                                        Modifier.Companion companion;
                                        PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent4;
                                        ?? r0;
                                        Modifier.Companion companion2;
                                        Composer composer6 = composer5;
                                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                        if ((i8 & 17) == 16 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(689645564, i8, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposable.<anonymous>.<anonymous>.<anonymous> (PostSignUpFundAccountDetailComposable.kt:78)");
                                        }
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(companion3, paddingValues2), ScrollKt.rememberScrollState(0, composer6, 0, 1), false, null, false, 14, null);
                                        Alignment.Companion companion4 = Alignment.INSTANCE;
                                        Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                                        PostSignUpFundAccountDetailContent postSignUpFundAccountDetailContent5 = postSignUpFundAccountDetailContent3;
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer6, 48);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer6, modifierVerticalScroll$default);
                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                        if (composer6.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor);
                                        } else {
                                            composer6.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer6);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        RichText title = postSignUpFundAccountDetailContent5.getTitle();
                                        composer6.startReplaceGroup(-174279741);
                                        if (title == null) {
                                            companion = companion3;
                                            postSignUpFundAccountDetailContent4 = postSignUpFundAccountDetailContent5;
                                            r0 = 0;
                                        } else {
                                            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                            int i9 = BentoTheme.$stable;
                                            companion = companion3;
                                            postSignUpFundAccountDetailContent4 = postSignUpFundAccountDetailContent5;
                                            r0 = 0;
                                            BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15957toAnnotatedStringiJQMabo(title, 0L, composer6, 0, 1), PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme22.getSpacing(composer6, i9).m21592getMediumD9Ej5fM(), bentoTheme22.getSpacing(composer6, i9).m21590getDefaultD9Ej5fM(), bentoTheme22.getSpacing(composer6, i9).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme22.getTypography(composer6, i9).getDisplayCapsuleSmall(), composer6, 0, 0, 8188);
                                            Unit unit = Unit.INSTANCE;
                                        }
                                        composer6.endReplaceGroup();
                                        String subtitleMarkdown = postSignUpFundAccountDetailContent4.getSubtitleMarkdown();
                                        composer6.startReplaceGroup(-174260023);
                                        if (subtitleMarkdown != null) {
                                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                            int i10 = BentoTheme.$stable;
                                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme3.getSpacing(composer6, i10).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer6, i10).m21593getSmallD9Ej5fM(), bentoTheme3.getSpacing(composer6, i10).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), r0);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer6, r0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer6, modifierM5146paddingqDBjuR0$default);
                                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                            if (composer6.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor2);
                                            } else {
                                                composer6.useNode();
                                            }
                                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer6);
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            BentoMarkdownText2.BentoMarkdownText(subtitleMarkdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme3.getTypography(composer6, i10).getTextM(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0L, 0L, false, composer6, BentoMarkdownText.$stable << 15, 28), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer5, MarkdownStyle.$stable << 6, 26);
                                            composer6 = composer5;
                                            composer6.endNode();
                                            Unit unit2 = Unit.INSTANCE;
                                        }
                                        composer6.endReplaceGroup();
                                        RichText subtitle = postSignUpFundAccountDetailContent4.getSubtitle();
                                        composer6.startReplaceGroup(-174232659);
                                        if (subtitle == null) {
                                            companion2 = companion;
                                        } else {
                                            BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                                            int i11 = BentoTheme.$stable;
                                            companion2 = companion;
                                            BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15957toAnnotatedStringiJQMabo(subtitle, 0L, composer6, 0, 1), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme4.getSpacing(composer6, i11).m21592getMediumD9Ej5fM(), bentoTheme4.getSpacing(composer6, i11).m21593getSmallD9Ej5fM(), bentoTheme4.getSpacing(composer6, i11).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, bentoTheme4.getTypography(composer6, i11).getTextM(), composer6, 0, 0, 8124);
                                            Unit unit3 = Unit.INSTANCE;
                                        }
                                        composer6.endReplaceGroup();
                                        List<ValuePropWithIcon<GenericAction>> valueProps = postSignUpFundAccountDetailContent4.getValueProps();
                                        composer6.startReplaceGroup(-174212444);
                                        if (valueProps != null) {
                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composer6, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer6, 0);
                                            ImmutableList immutableList = extensions2.toImmutableList(valueProps);
                                            composer6.startReplaceGroup(-1772220517);
                                            SduiColumns.SduiColumn(immutableList, GenericAction.class, companion2, null, null, HorizontalPadding.Default, arrangement.getTop(), companion4.getStart(), false, composer6, 100663296, 0);
                                            composer5.endReplaceGroup();
                                            Unit unit4 = Unit.INSTANCE;
                                        }
                                        composer5.endReplaceGroup();
                                        composer5.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), composer4, 3456, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 384, 12582912, 98298);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        context2 = context;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i2 & 64) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomBarComposable(final String str, final String str2, final RichText richText, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        int i3;
        int i4;
        Modifier.Companion companion;
        int i5;
        BentoTheme bentoTheme;
        Modifier.Companion companion2;
        int i6;
        BentoTheme bentoTheme2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1396871527);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(richText) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        int i7 = i2;
        if ((74899 & i7) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1396871527, i7, -1, "com.robinhood.android.onboarding.ui.postsignup.fund.BottomBarComposable (PostSignUpFundAccountDetailComposable.kt:145)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i8 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme3.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-414205042);
            if (richText == null) {
                bentoTheme = bentoTheme3;
                i4 = i8;
                i3 = 1;
                i5 = i7;
                companion = companion3;
            } else {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z = (458752 & i7) == 131072;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposableKt$BottomBarComposable$1$1$disclosureTextAsAnnotatedString$1$1
                        @Override // androidx.compose.p011ui.text.LinkInteractionListener
                        public final void onClick(LinkAnnotation link) {
                            Intrinsics.checkNotNullParameter(link, "link");
                            function1.invoke(((LinkAnnotation.Url) link).getUrl());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                i3 = 1;
                i4 = i8;
                companion = companion3;
                i5 = i7;
                bentoTheme = bentoTheme3;
                BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15959toAnnotatedStringV23IgeMak(richText, 0L, (LinkInteractionListener) objRememberedValue, composerStartRestartGroup, 0, 1), PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme3.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 2, null), null, null, null, null, null, 0, false, 0, 0, null, null, TextStyle.m7655copyp1EtxEg$default(bentoTheme3.getTypography(composerStartRestartGroup, i4).getTextS(), bentoTheme3.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-414179614);
            if (str == null) {
                bentoTheme2 = bentoTheme;
                companion2 = companion;
                i6 = i4;
            } else {
                Modifier.Companion companion5 = companion;
                companion2 = companion5;
                i6 = i4;
                bentoTheme2 = bentoTheme;
                BentoButtonKt.m20586BentoButtonEikTQX8(function0, str, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion5, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), true, false, false, true, false, null, 108, null), 0.0f, i3, null), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 2, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i5 >> 9) & 14, 0, 8184);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-414147437);
            if (str2 != null) {
                BentoTheme bentoTheme4 = bentoTheme2;
                int i9 = i6;
                BentoButtonKt.m20586BentoButtonEikTQX8(function02, str2, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.SKIP, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null), bentoTheme4.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme4.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), bentoTheme4.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM(), 2, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i5 >> 12) & 14) | 24576, 0, 8168);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostSignUpFundAccountDetailComposable3.BottomBarComposable$lambda$6(str, str2, richText, function0, function02, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
