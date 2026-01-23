package com.robinhood.android.crypto.tab.p093ui.news;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.contracts.CryptoNewsFragmentKey;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.crypto.tab.util.CryptoNewsArticle;
import com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposable;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.newsfeed.extensions.Contents;
import com.robinhood.android.newsfeed.extensions.LoggedCustomTabs2;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.android.newsfeed.view.util.LoggedCustomTabs;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.NewsFeedItem;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: CryptoHomeNewsComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a/\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, m3636d2 = {"CryptoHomeNewsItemTestTag", "", "getCryptoHomeNewsItemTestTag$annotations", "()V", "getCryptoHomeNewsItemTestTag", "()Ljava/lang/String;", "ANALYTICS_PREFIX", "CryptoHomeNewsComposable", "", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "loggedCustomTabs", "Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "duxo", "Lcom/robinhood/android/crypto/tab/ui/news/CryptoHomeNewsDuxo;", "(Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/crypto/tab/ui/news/CryptoHomeNewsDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-tab_externalDebug", "viewState", "Lcom/robinhood/android/crypto/tab/ui/news/CryptoHomeNewsViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.news.CryptoHomeNewsComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeNewsComposable {
    private static final String ANALYTICS_PREFIX = "cht";
    private static final String CryptoHomeNewsItemTestTag = "cryptoHomeNewsItem";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeNewsComposable$lambda$1(Navigator navigator, LoggedCustomTabs loggedCustomTabs, EventLogger eventLogger, CryptoHomeNewsDuxo cryptoHomeNewsDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHomeNewsComposable(navigator, loggedCustomTabs, eventLogger, cryptoHomeNewsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeNewsComposable$lambda$9(Navigator navigator, LoggedCustomTabs loggedCustomTabs, EventLogger eventLogger, CryptoHomeNewsDuxo cryptoHomeNewsDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHomeNewsComposable(navigator, loggedCustomTabs, eventLogger, cryptoHomeNewsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCryptoHomeNewsItemTestTag$annotations() {
    }

    public static final String getCryptoHomeNewsItemTestTag() {
        return CryptoHomeNewsItemTestTag;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoHomeNewsComposable(final Navigator navigator, final LoggedCustomTabs loggedCustomTabs, final EventLogger eventLogger, CryptoHomeNewsDuxo cryptoHomeNewsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        CryptoHomeNewsDuxo cryptoHomeNewsDuxo2;
        int i4;
        boolean z;
        int i5;
        final CryptoHomeNewsDuxo cryptoHomeNewsDuxo3;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        final Navigator navigator2;
        final EventLogger eventLogger2;
        final CryptoHomeNewsDuxo cryptoHomeNewsDuxo4;
        LoggedCustomTabs loggedCustomTabs2;
        boolean z2;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        int i6;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(loggedCustomTabs, "loggedCustomTabs");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Composer composerStartRestartGroup = composer.startRestartGroup(2127849550);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(navigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(loggedCustomTabs) : composerStartRestartGroup.changedInstance(loggedCustomTabs) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventLogger) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                cryptoHomeNewsDuxo2 = cryptoHomeNewsDuxo;
                int i7 = composerStartRestartGroup.changedInstance(cryptoHomeNewsDuxo2) ? 2048 : 1024;
                i3 |= i7;
            } else {
                cryptoHomeNewsDuxo2 = cryptoHomeNewsDuxo;
            }
            i3 |= i7;
        } else {
            cryptoHomeNewsDuxo2 = cryptoHomeNewsDuxo;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            navigator2 = navigator;
            eventLogger2 = eventLogger;
            cryptoHomeNewsDuxo4 = cryptoHomeNewsDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    i4 = 0;
                    z = -1633490746;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHomeNewsDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.news.CryptoHomeNewsComposableKt$CryptoHomeNewsComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.news.CryptoHomeNewsComposableKt$CryptoHomeNewsComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    cryptoHomeNewsDuxo2 = (CryptoHomeNewsDuxo) baseDuxo;
                    i3 &= -7169;
                }
                i5 = i3;
                cryptoHomeNewsDuxo3 = cryptoHomeNewsDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2127849550, i5, -1, "com.robinhood.android.crypto.tab.ui.news.CryptoHomeNewsComposable (CryptoHomeNewsComposable.kt:46)");
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeNewsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                if (!CryptoHomeNewsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isContentVisible()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.news.CryptoHomeNewsComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoHomeNewsComposable.CryptoHomeNewsComposable$lambda$1(navigator, loggedCustomTabs, eventLogger, cryptoHomeNewsDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                CryptoHomeNewsDuxo cryptoHomeNewsDuxo5 = cryptoHomeNewsDuxo3;
                Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM()), composerStartRestartGroup, i4);
                Composer composer2 = composerStartRestartGroup;
                int i9 = i5;
                int i10 = 32;
                Context context3 = context2;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13013R.string.crypto_home_news_title, composerStartRestartGroup, i4), PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getDisplayCapsuleMedium(), composer2, 0, 0, 8188);
                composer2.startReplaceGroup(459008102);
                final int i11 = 0;
                for (CryptoNewsArticle cryptoNewsArticle : CryptoHomeNewsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCryptoArticles()) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final CryptoNewsArticle cryptoNewsArticle2 = cryptoNewsArticle;
                    Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_HOME_TAB, null, null, null, 14, null), null, null, new Component(Component.ComponentType.NEWS_ROW, null, null, 6, null), null, 45, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), CryptoHomeNewsItemTestTag);
                    composer2.startReplaceGroup(-1224400529);
                    if ((i9 & 112) != i10) {
                        if ((i9 & 64) != 0) {
                            loggedCustomTabs2 = loggedCustomTabs;
                            if (composer2.changedInstance(loggedCustomTabs2)) {
                            }
                            context = context3;
                            zChangedInstance = z2 | composer2.changedInstance(context) | composer2.changedInstance(cryptoNewsArticle2) | composer2.changed(i11) | composer2.changedInstance(eventLogger);
                            objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                i6 = i10;
                                final LoggedCustomTabs loggedCustomTabs3 = loggedCustomTabs2;
                                Object obj = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.news.CryptoHomeNewsComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoHomeNewsComposable.CryptoHomeNewsComposable$lambda$6$lambda$3$lambda$2(loggedCustomTabs3, context, cryptoNewsArticle2, i11, eventLogger);
                                    }
                                };
                                cryptoNewsArticle2 = cryptoNewsArticle2;
                                composer2.updateRememberedValue(obj);
                                objRememberedValue = obj;
                            } else {
                                i6 = i10;
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(-1633490746);
                            zChangedInstance2 = composer2.changedInstance(navigator) | composer2.changedInstance(context);
                            objRememberedValue2 = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.news.CryptoHomeNewsComposableKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return CryptoHomeNewsComposable.CryptoHomeNewsComposable$lambda$6$lambda$5$lambda$4(navigator, context, (RelatedInstrument) obj2);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            CryptoNewsArticleComposable.CryptoNewsArticleComposable(cryptoNewsArticle2, function0, (Function1) objRememberedValue2, modifierTestTag, composer2, 0, 0);
                            i11 = i12;
                            context3 = context;
                            i10 = i6;
                        } else {
                            loggedCustomTabs2 = loggedCustomTabs;
                        }
                        z2 = false;
                        context = context3;
                        zChangedInstance = z2 | composer2.changedInstance(context) | composer2.changedInstance(cryptoNewsArticle2) | composer2.changed(i11) | composer2.changedInstance(eventLogger);
                        objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance) {
                            i6 = i10;
                            final LoggedCustomTabs loggedCustomTabs32 = loggedCustomTabs2;
                            Object obj2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.news.CryptoHomeNewsComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoHomeNewsComposable.CryptoHomeNewsComposable$lambda$6$lambda$3$lambda$2(loggedCustomTabs32, context, cryptoNewsArticle2, i11, eventLogger);
                                }
                            };
                            cryptoNewsArticle2 = cryptoNewsArticle2;
                            composer2.updateRememberedValue(obj2);
                            objRememberedValue = obj2;
                        }
                        Function0 function02 = (Function0) objRememberedValue;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-1633490746);
                        zChangedInstance2 = composer2.changedInstance(navigator) | composer2.changedInstance(context);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.news.CryptoHomeNewsComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj22) {
                                    return CryptoHomeNewsComposable.CryptoHomeNewsComposable$lambda$6$lambda$5$lambda$4(navigator, context, (RelatedInstrument) obj22);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        CryptoNewsArticleComposable.CryptoNewsArticleComposable(cryptoNewsArticle2, function02, (Function1) objRememberedValue2, modifierTestTag, composer2, 0, 0);
                        i11 = i12;
                        context3 = context;
                        i10 = i6;
                    } else {
                        loggedCustomTabs2 = loggedCustomTabs;
                    }
                    z2 = true;
                    context = context3;
                    zChangedInstance = z2 | composer2.changedInstance(context) | composer2.changedInstance(cryptoNewsArticle2) | composer2.changed(i11) | composer2.changedInstance(eventLogger);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance) {
                    }
                    Function0 function022 = (Function0) objRememberedValue;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1633490746);
                    zChangedInstance2 = composer2.changedInstance(navigator) | composer2.changedInstance(context);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2) {
                    }
                    composer2.endReplaceGroup();
                    CryptoNewsArticleComposable.CryptoNewsArticleComposable(cryptoNewsArticle2, function022, (Function1) objRememberedValue2, modifierTestTag, composer2, 0, 0);
                    i11 = i12;
                    context3 = context;
                    i10 = i6;
                }
                navigator2 = navigator;
                eventLogger2 = eventLogger;
                final Context context4 = context3;
                composer2.endReplaceGroup();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i13 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme2.getSpacing(composer2, i13).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i13).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 12, null);
                String strStringResource = StringResources_androidKt.stringResource(C13013R.string.crypto_home_news_show_more, composer2, 0);
                composer2.startReplaceGroup(-1746271574);
                boolean zChangedInstance4 = composer2.changedInstance(navigator2) | composer2.changedInstance(context4) | composer2.changedInstance(eventLogger2);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.news.CryptoHomeNewsComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoHomeNewsComposable.CryptoHomeNewsComposable$lambda$8$lambda$7(navigator2, context4, eventLogger2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue4, strStringResource, modifierM5146paddingqDBjuR0$default, null, null, false, null, composer2, 0, 120);
                composerStartRestartGroup = composer2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cryptoHomeNewsDuxo4 = cryptoHomeNewsDuxo5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i5 = i3 & (-7169);
                    cryptoHomeNewsDuxo3 = cryptoHomeNewsDuxo2;
                    z = -1633490746;
                    i4 = 0;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeNewsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    if (!CryptoHomeNewsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isContentVisible()) {
                    }
                }
            }
            z = -1633490746;
            i4 = 0;
            i5 = i3;
            cryptoHomeNewsDuxo3 = cryptoHomeNewsDuxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeNewsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            if (!CryptoHomeNewsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isContentVisible()) {
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final EventLogger eventLogger3 = eventLogger2;
            final Navigator navigator3 = navigator2;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.news.CryptoHomeNewsComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return CryptoHomeNewsComposable.CryptoHomeNewsComposable$lambda$9(navigator3, loggedCustomTabs, eventLogger3, cryptoHomeNewsDuxo4, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeNewsComposable$lambda$6$lambda$3$lambda$2(LoggedCustomTabs loggedCustomTabs, Context context, CryptoNewsArticle cryptoNewsArticle, int i, EventLogger eventLogger) {
        LoggedCustomTabs2.showNewsFeedArticle(loggedCustomTabs, context, cryptoNewsArticle.getArticle(), ANALYTICS_PREFIX, "CRYPTO_HOME_TAB");
        Screen screen = new Screen(Screen.Name.CRYPTO_HOME_TAB, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.NEWS_ROW, null, null, 6, null);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_NEWS_ARTICLE;
        String string2 = cryptoNewsArticle.getArticle().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new com.robinhood.rosetta.eventlogging.Context(i + 1, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, new NewsFeedItem(string2, Contents.getContentType(cryptoNewsArticle.getArticle()), Contents.getMediaType(cryptoNewsArticle.getArticle()), cryptoNewsArticle.getArticle().getSource(), 0, null, 48, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65538, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }

    private static final CryptoHomeNewsViewState CryptoHomeNewsComposable$lambda$0(SnapshotState4<CryptoHomeNewsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeNewsComposable$lambda$6$lambda$5$lambda$4(Navigator navigator, Context context, RelatedInstrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(instrument.getId(), null, null, InstrumentDetailSource.CRYPTO_HOME_NEWS, false, 22, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeNewsComposable$lambda$8$lambda$7(Navigator navigator, Context context, EventLogger eventLogger) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, CryptoNewsFragmentKey.INSTANCE, false, false, false, null, false, null, false, false, null, null, 4092, null);
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_CRYPTO_NEWSFEED, new Screen(Screen.Name.CRYPTO_HOME_TAB, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        return Unit.INSTANCE;
    }
}
