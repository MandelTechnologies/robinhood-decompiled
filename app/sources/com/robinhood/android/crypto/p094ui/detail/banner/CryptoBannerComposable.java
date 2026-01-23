package com.robinhood.android.crypto.p094ui.detail.banner;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.crypto.p094ui.detail.banner.CryptoBannerDataState;
import com.robinhood.android.crypto.p094ui.detail.banner.CryptoBannerDuxo;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: CryptoBannerComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"CryptoBannerComposable", "", "currencyPairId", "Ljava/util/UUID;", "bannerType", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerType;", "modifier", "Landroidx/compose/ui/Modifier;", "paddingWhenVisible", "Landroidx/compose/foundation/layout/PaddingValues;", "duxo", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDuxo;", "(Ljava/util/UUID;Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerType;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDuxo;Landroidx/compose/runtime/Composer;II)V", "CryptoBannerSection", "state", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerState;", "(Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto_externalDebug", "viewState", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.banner.CryptoBannerComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoBannerComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoBannerComposable$lambda$3(UUID uuid, CryptoBannerType cryptoBannerType, Modifier modifier, PaddingValues paddingValues, CryptoBannerDuxo cryptoBannerDuxo, int i, int i2, Composer composer, int i3) {
        CryptoBannerComposable(uuid, cryptoBannerType, modifier, paddingValues, cryptoBannerDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoBannerSection$lambda$7(CryptoBannerState cryptoBannerState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoBannerSection(cryptoBannerState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoBannerComposable(final UUID currencyPairId, final CryptoBannerType bannerType, Modifier modifier, PaddingValues paddingValues, CryptoBannerDuxo cryptoBannerDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        PaddingValues paddingValues2;
        CryptoBannerDuxo cryptoBannerDuxo2;
        Modifier modifier3;
        final PaddingValues paddingValuesM5135PaddingValues0680j_4;
        int i5;
        Composer composer2;
        int i6;
        CryptoBannerDuxo cryptoBannerDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        CryptoBannerState bannerState;
        Modifier modifier4;
        Unit unit;
        final PaddingValues paddingValues3;
        final CryptoBannerDuxo cryptoBannerDuxo4;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(bannerType, "bannerType");
        Composer composerStartRestartGroup = composer.startRestartGroup(1530827813);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(currencyPairId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(bannerType.ordinal()) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    paddingValues2 = paddingValues;
                    i3 |= composerStartRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        cryptoBannerDuxo2 = cryptoBannerDuxo;
                        int i8 = composerStartRestartGroup.changedInstance(cryptoBannerDuxo2) ? 16384 : 8192;
                        i3 |= i8;
                    } else {
                        cryptoBannerDuxo2 = cryptoBannerDuxo;
                    }
                    i3 |= i8;
                } else {
                    cryptoBannerDuxo2 = cryptoBannerDuxo;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        paddingValuesM5135PaddingValues0680j_4 = i4 == 0 ? PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)) : paddingValues2;
                        if ((i2 & 16) == 0) {
                            CryptoBannerDuxo.InitArgs initArgs = new CryptoBannerDuxo.InitArgs(currencyPairId, bannerType);
                            String str = bannerType.name() + "_" + currencyPairId;
                            composerStartRestartGroup.startReplaceGroup(2050738472);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
                            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            composer2 = composerStartRestartGroup;
                            i5 = 0;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoBannerDuxo.class), current, str, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                            composer2.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.ui.detail.banner.CryptoBannerComposableKt$CryptoBannerComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.ui.detail.banner.CryptoBannerComposableKt$CryptoBannerComposable$$inlined$duxo$1.1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                            }
                                        };
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                            composer2.endReplaceGroup();
                            CryptoBannerDuxo cryptoBannerDuxo5 = (CryptoBannerDuxo) baseDuxo;
                            i6 = i3 & (-57345);
                            cryptoBannerDuxo3 = cryptoBannerDuxo5;
                        } else {
                            i5 = 0;
                            composer2 = composerStartRestartGroup;
                            i6 = i3;
                            cryptoBannerDuxo3 = cryptoBannerDuxo2;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        i6 = i3;
                        modifier3 = modifier2;
                        paddingValuesM5135PaddingValues0680j_4 = paddingValues2;
                        cryptoBannerDuxo3 = cryptoBannerDuxo2;
                        i5 = 0;
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1530827813, i6, -1, "com.robinhood.android.crypto.ui.detail.banner.CryptoBannerComposable (CryptoBannerComposable.kt:39)");
                    }
                    Composer composer4 = composer2;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoBannerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                    composer3 = composer4;
                    bannerState = CryptoBannerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getBannerState();
                    composer3.startReplaceGroup(-2048229018);
                    if (bannerState != null) {
                        modifier4 = modifier3;
                        unit = null;
                    } else {
                        modifier4 = modifier3;
                        CryptoBannerSection(bannerState, PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, paddingValuesM5135PaddingValues0680j_4.getTop(), 0.0f, paddingValuesM5135PaddingValues0680j_4.getBottom(), 5, null), composer3, i5, i5);
                        unit = Unit.INSTANCE;
                    }
                    composer3.endReplaceGroup();
                    if (unit == null) {
                        final CryptoBannerDataState.IacBannerState iacBannerState = CryptoBannerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getIacBannerState();
                        composer3.startReplaceGroup(-2048212825);
                        if (iacBannerState != null) {
                            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(664083430, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.banner.CryptoBannerComposableKt$CryptoBannerComposable$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i9) {
                                    if ((i9 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(664083430, i9, -1, "com.robinhood.android.crypto.ui.detail.banner.CryptoBannerComposable.<anonymous>.<anonymous> (CryptoBannerComposable.kt:59)");
                                    }
                                    InfoBannerComponent.InfoBannerComponent(iacBannerState.getAccountNumber(), IacInfoBannerLocation.INFO_BANNER_CRYPTO_DETAIL_PAGE_MOBILE_TOP_LEVEL, null, null, currencyPairId, null, null, null, null, null, null, paddingValuesM5135PaddingValues0680j_4, null, composer5, 48, 0, 6124);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 6);
                        }
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues3 = paddingValuesM5135PaddingValues0680j_4;
                    cryptoBannerDuxo4 = cryptoBannerDuxo3;
                    modifier5 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier5 = modifier2;
                    paddingValues3 = paddingValues2;
                    cryptoBannerDuxo4 = cryptoBannerDuxo2;
                    composer3 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.banner.CryptoBannerComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoBannerComposable.CryptoBannerComposable$lambda$3(currencyPairId, bannerType, modifier5, paddingValues3, cryptoBannerDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            paddingValues2 = paddingValues;
            if ((i & 24576) == 0) {
            }
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Composer composer42 = composer2;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoBannerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                    composer3 = composer42;
                    bannerState = CryptoBannerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getBannerState();
                    composer3.startReplaceGroup(-2048229018);
                    if (bannerState != null) {
                    }
                    composer3.endReplaceGroup();
                    if (unit == null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    paddingValues3 = paddingValuesM5135PaddingValues0680j_4;
                    cryptoBannerDuxo4 = cryptoBannerDuxo3;
                    modifier5 = modifier4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        paddingValues2 = paddingValues;
        if ((i & 24576) == 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CryptoBannerSection(final CryptoBannerState cryptoBannerState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final GenericAction action;
        AnnotatedString annotatedString;
        Function0 function0;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(765175091);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cryptoBannerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(765175091, i3, -1, "com.robinhood.android.crypto.ui.detail.banner.CryptoBannerSection (CryptoBannerComposable.kt:74)");
                }
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                AnnotatedString bannerText = cryptoBannerState.getBannerText(composerStartRestartGroup, i3 & 14);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                long jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU();
                int i6 = i3;
                BentoIcon4 icon = cryptoBannerState.getIcon();
                action = cryptoBannerState.getAction();
                composerStartRestartGroup.startReplaceGroup(893869984);
                if (action != null) {
                    function0 = null;
                    annotatedString = bannerText;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(action) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    annotatedString = bannerText;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.banner.CryptoBannerComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoBannerComposable.CryptoBannerSection$lambda$6$lambda$5$lambda$4(action, navigator, context);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function0 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(annotatedString, null, jM21425getFg0d7_KjU, jM21372getBg20d7_KjU, modifier3, icon, function0, null, composerStartRestartGroup, ((i6 << 9) & 57344) | 48 | (BentoIcon4.$stable << 15), 128);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.banner.CryptoBannerComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoBannerComposable.CryptoBannerSection$lambda$7(cryptoBannerState, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            AnnotatedString bannerText2 = cryptoBannerState.getBannerText(composerStartRestartGroup, i3 & 14);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
            long jM21372getBg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21372getBg20d7_KjU();
            int i62 = i3;
            BentoIcon4 icon2 = cryptoBannerState.getIcon();
            action = cryptoBannerState.getAction();
            composerStartRestartGroup.startReplaceGroup(893869984);
            if (action != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(annotatedString, null, jM21425getFg0d7_KjU2, jM21372getBg20d7_KjU2, modifier3, icon2, function0, null, composerStartRestartGroup, ((i62 << 9) & 57344) | 48 | (BentoIcon4.$stable << 15), 128);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final CryptoBannerViewState CryptoBannerComposable$lambda$0(SnapshotState4<CryptoBannerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoBannerSection$lambda$6$lambda$5$lambda$4(GenericAction genericAction, Navigator navigator, Context context) {
        if (genericAction instanceof GenericAction.DeeplinkAction) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((GenericAction.DeeplinkAction) genericAction).getUri(), null, null, false, null, 60, null);
        }
        return Unit.INSTANCE;
    }
}
