package com.robinhood.android.indexes.detail.pip;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import com.robinhood.android.common.detail.component.C11117R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureDuxo;
import com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureViewState;
import com.robinhood.utils.p409ui.context.BaseContexts;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: DetailPageOpenPipActionComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"DetailPageOpenPipActionComposable", "", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "pictureInPictureDuxo", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureDuxo;", "(Ljava/lang/String;Ljava/util/UUID;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-index-detail-page_externalDebug", "viewState", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.indexes.detail.pip.DetailPageOpenPipActionComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class DetailPageOpenPipActionComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailPageOpenPipActionComposable$lambda$1(String str, UUID uuid, Modifier modifier, PictureInPictureDuxo pictureInPictureDuxo, int i, int i2, Composer composer, int i3) {
        DetailPageOpenPipActionComposable(str, uuid, modifier, pictureInPictureDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailPageOpenPipActionComposable$lambda$4(String str, UUID uuid, Modifier modifier, PictureInPictureDuxo pictureInPictureDuxo, int i, int i2, Composer composer, int i3) {
        DetailPageOpenPipActionComposable(str, uuid, modifier, pictureInPictureDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DetailPageOpenPipActionComposable(final String accountNumber, final UUID instrumentId, Modifier modifier, PictureInPictureDuxo pictureInPictureDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PictureInPictureDuxo pictureInPictureDuxo2;
        Composer composer2;
        int i4;
        final Modifier modifier3;
        int i5;
        final PictureInPictureDuxo pictureInPictureDuxo3;
        Composer composer3;
        Composer composer4;
        PictureInPictureDuxo pictureInPictureDuxo4;
        final PictureInPictureDuxo pictureInPictureDuxo5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1877829980);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(instrumentId) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    pictureInPictureDuxo2 = pictureInPictureDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(pictureInPictureDuxo2) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    pictureInPictureDuxo2 = pictureInPictureDuxo;
                }
                i3 |= i7;
            } else {
                pictureInPictureDuxo2 = pictureInPictureDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PictureInPictureDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.indexes.detail.pip.DetailPageOpenPipActionComposableKt$DetailPageOpenPipActionComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.indexes.detail.pip.DetailPageOpenPipActionComposableKt$DetailPageOpenPipActionComposable$$inlined$duxo$1.1
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
                        i4 = i3 & (-7169);
                        modifier3 = modifier4;
                        i5 = 4;
                        pictureInPictureDuxo3 = (PictureInPictureDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = i3;
                        modifier3 = modifier4;
                        i5 = 4;
                        pictureInPictureDuxo3 = pictureInPictureDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    i5 = 4;
                    modifier3 = modifier2;
                    pictureInPictureDuxo3 = pictureInPictureDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1877829980, i4, -1, "com.robinhood.android.indexes.detail.pip.DetailPageOpenPipActionComposable (DetailPageOpenPipActionComposable.kt:27)");
                }
                composer3 = composer2;
                composer4 = composer3;
                if (DetailPageOpenPipActionComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(pictureInPictureDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7)).getIsInOptionsPipExperiment()) {
                    pictureInPictureDuxo4 = pictureInPictureDuxo3;
                } else {
                    final Navigator navigator = (Navigator) composer4.consume(LocalNavigator.getLocalNavigator());
                    final AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext((Context) composer4.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                    if (appCompatActivityFindActivityBaseContext == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer4.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup2 != null) {
                            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.indexes.detail.pip.DetailPageOpenPipActionComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return DetailPageOpenPipActionComposable.DetailPageOpenPipActionComposable$lambda$1(accountNumber, instrumentId, modifier3, pictureInPictureDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    pictureInPictureDuxo4 = pictureInPictureDuxo3;
                    BentoIconButton4.Icon.HeroSize24 heroSize24 = new BentoIconButton4.Icon.HeroSize24(ServerToBentoAssetMapper2.PICTURE_IN_PICTURE_24);
                    long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU();
                    Color.Companion companion = Color.INSTANCE;
                    long jM6725getTransparent0d7_KjU = companion.m6725getTransparent0d7_KjU();
                    long jM6725getTransparent0d7_KjU2 = companion.m6725getTransparent0d7_KjU();
                    String strStringResource = StringResources_androidKt.stringResource(C11117R.string.open_picture_in_picture, composer4, 0);
                    composer4.startReplaceGroup(-1224400529);
                    boolean zChangedInstance2 = composer4.changedInstance(navigator) | composer4.changedInstance(appCompatActivityFindActivityBaseContext) | composer4.changedInstance(instrumentId) | ((i4 & 14) == i5);
                    Object objRememberedValue2 = composer4.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.indexes.detail.pip.DetailPageOpenPipActionComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DetailPageOpenPipActionComposable.DetailPageOpenPipActionComposable$lambda$3$lambda$2(navigator, appCompatActivityFindActivityBaseContext, instrumentId, accountNumber);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue2);
                    }
                    composer4.endReplaceGroup();
                    Modifier modifier5 = modifier3;
                    BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue2, heroSize24, strStringResource, modifier5, null, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM6725getTransparent0d7_KjU), Color.m6701boximpl(jM6725getTransparent0d7_KjU2), null, false, composer4, (BentoIconButton4.Icon.HeroSize24.$stable << 3) | 113246208 | ((i4 << 3) & 7168), 0, 1584);
                    modifier3 = modifier5;
                    composer4 = composer4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                pictureInPictureDuxo5 = pictureInPictureDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                pictureInPictureDuxo5 = pictureInPictureDuxo2;
                composer4 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.indexes.detail.pip.DetailPageOpenPipActionComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DetailPageOpenPipActionComposable.DetailPageOpenPipActionComposable$lambda$4(accountNumber, instrumentId, modifier3, pictureInPictureDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer3 = composer2;
                composer4 = composer3;
                if (DetailPageOpenPipActionComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(pictureInPictureDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7)).getIsInOptionsPipExperiment()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                pictureInPictureDuxo5 = pictureInPictureDuxo4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailPageOpenPipActionComposable$lambda$3$lambda$2(Navigator navigator, AppCompatActivity appCompatActivity, UUID uuid, String str) {
        Navigator.DefaultImpls.startActivity$default(navigator, appCompatActivity, new PictureInPictureKey.Index(uuid, str), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    private static final PictureInPictureViewState DetailPageOpenPipActionComposable$lambda$0(SnapshotState4<PictureInPictureViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
