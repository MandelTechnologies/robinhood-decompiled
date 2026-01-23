package com.robinhood.shared.documents.prism;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Size;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.FallbackStrategy;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.PendingRecording;
import androidx.camera.video.Quality;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoRecordEvent;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.core.util.Consumer;
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
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionState2;
import com.google.accompanist.permissions.PermissionsUtil;
import com.google.accompanist.permissions.PermissionsUtil2;
import com.google.mlkit.vision.common.InputImage;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.shared.documents.prism.animations.FaceIconComposable2;
import com.robinhood.shared.documents.prism.animations.FlareRingComposable;
import com.robinhood.shared.documents.prism.animations.PrismCheckmarkComposable;
import com.robinhood.shared.documents.prism.animations.PrismCrossComposable;
import com.robinhood.shared.documents.prism.models.PrismCaptureFailedError;
import com.robinhood.utils.resource.StringResource;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PrismComposable.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\u001a#\u0010\r\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u000e\u001a(\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a8\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002¨\u0006\u001b²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\u0012\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u008a\u0084\u0002"}, m3636d2 = {"PrismComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/documents/prism/PrismDuxo;", "onFinished", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/documents/prism/PrismDuxo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PrismAnimations", "viewState", "Lcom/robinhood/shared/documents/prism/PrismViewState;", "(Lcom/robinhood/shared/documents/prism/PrismViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CameraEventHandler", "(Lcom/robinhood/shared/documents/prism/PrismDuxo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "trackFace", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "cameraExecutor", "Ljava/util/concurrent/Executor;", "captureVideoAndPhoto", "context", "Landroid/content/Context;", "videoBitRate", "", "feature-prism_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/documents/prism/PrismEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.documents.prism.PrismComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PrismComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraEventHandler$lambda$10(PrismDuxo prismDuxo, Function0 function0, int i, Composer composer, int i2) {
        CameraEventHandler(prismDuxo, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrismAnimations$lambda$7(PrismViewState prismViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PrismAnimations(prismViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrismComposable$lambda$5(Modifier modifier, PrismDuxo prismDuxo, Function0 function0, int i, int i2, Composer composer, int i3) {
        PrismComposable(modifier, prismDuxo, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrismComposable(Modifier modifier, PrismDuxo prismDuxo, final Function0<Unit> onFinished, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        PrismDuxo prismDuxo2;
        Modifier modifier3;
        PrismDuxo prismDuxo3;
        EventLogger current;
        PermissionState permissionStateRememberPermissionState;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        boolean zChanged;
        Object objRememberedValue;
        int i4;
        String string2;
        PrismDuxo prismDuxo4;
        Modifier modifier4;
        final PrismDuxo prismDuxo5;
        final Modifier modifier5;
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        Composer composerStartRestartGroup = composer.startRestartGroup(1949502605);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                prismDuxo2 = prismDuxo;
                int i6 = composerStartRestartGroup.changedInstance(prismDuxo2) ? 32 : 16;
                i3 |= i6;
            } else {
                prismDuxo2 = prismDuxo;
            }
            i3 |= i6;
        } else {
            prismDuxo2 = prismDuxo;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFinished) ? 256 : 128;
        }
        int i7 = i3;
        if ((i7 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier5 = modifier2;
            prismDuxo5 = prismDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current2 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PrismDuxo.class), current2, (String) null, factoryCreateViewModelFactory, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.documents.prism.PrismComposableKt$PrismComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.shared.documents.prism.PrismComposableKt$PrismComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i7 &= -113;
                    prismDuxo3 = (PrismDuxo) baseDuxo;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1949502605, i7, -1, "com.robinhood.shared.documents.prism.PrismComposable (PrismComposable.kt:73)");
                }
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                permissionStateRememberPermissionState = PermissionState2.rememberPermissionState("android.permission.CAMERA", null, composerStartRestartGroup, 6, 2);
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(prismDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                PermissionsUtil status = permissionStateRememberPermissionState.getStatus();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(permissionStateRememberPermissionState) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(prismDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new PrismComposable3(permissionStateRememberPermissionState, current, prismDuxo3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(status, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                if (PrismComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isLoading()) {
                    composerStartRestartGroup.startReplaceGroup(1085568208);
                    CameraEventHandler(prismDuxo3, onFinished, composerStartRestartGroup, (i7 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, companion.getCenterHorizontally(), composerStartRestartGroup, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Spacer2.Spacer(Column5.weight$default(column6, companion3, 0.8f, false, 2, null), composerStartRestartGroup, 0);
                    PrismAnimations(PrismComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle), null, composerStartRestartGroup, 0, 2);
                    Modifier modifierWeight$default = Column5.weight$default(column6, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1603164981);
                    if (PermissionsUtil2.isGranted(permissionStateRememberPermissionState.getStatus())) {
                        i4 = 0;
                        StringResource statusDetailRes = PrismComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getStatusDetailRes();
                        Intrinsics.checkNotNull(resources);
                        string2 = statusDetailRes.getText(resources).toString();
                    } else {
                        i4 = 0;
                        string2 = StringResources_androidKt.stringResource(C38776R.string.prism_enable_camera_permission_detail, composerStartRestartGroup, 0);
                    }
                    String str = string2;
                    composerStartRestartGroup.endReplaceGroup();
                    TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk());
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    int i9 = i4;
                    prismDuxo4 = prismDuxo3;
                    modifier4 = modifier3;
                    BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, textAlignM7912boximpl, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8126);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(-37488775);
                    if (!PermissionsUtil2.isGranted(permissionStateRememberPermissionState.getStatus())) {
                        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM());
                        String strStringResource = StringResources_androidKt.stringResource(C38776R.string.prism_enable_camera_permission_cta_text, composerStartRestartGroup, i9);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new PrismComposable4(context);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue3), strStringResource, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1085444425);
                    LoadingScreenComposablesKt.ShimmerLoadingComposable(new ShimmerLoaderType.Generic(false, 1, null), null, composerStartRestartGroup, ShimmerLoaderType.Generic.$stable, 2);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier4 = modifier3;
                    prismDuxo4 = prismDuxo3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                prismDuxo5 = prismDuxo4;
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i7 &= -113;
                }
                modifier3 = modifier2;
            }
            prismDuxo3 = prismDuxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            permissionStateRememberPermissionState = PermissionState2.rememberPermissionState("android.permission.CAMERA", null, composerStartRestartGroup, 6, 2);
            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(prismDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup = composerStartRestartGroup;
            PermissionsUtil status2 = permissionStateRememberPermissionState.getStatus();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChanged = composerStartRestartGroup.changed(permissionStateRememberPermissionState) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(prismDuxo3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new PrismComposable3(permissionStateRememberPermissionState, current, prismDuxo3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(status2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                if (PrismComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isLoading()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                prismDuxo5 = prismDuxo4;
                modifier5 = modifier4;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.documents.prism.PrismComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrismComposable.PrismComposable$lambda$5(modifier5, prismDuxo5, onFinished, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<PrismEvent> CameraEventHandler$lambda$8(SnapshotState4<Event<PrismEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final PrismViewState PrismComposable$lambda$0(SnapshotState4<PrismViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final void PrismAnimations(final PrismViewState prismViewState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1169195831);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(prismViewState) : composerStartRestartGroup.changedInstance(prismViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1169195831, i3, -1, "com.robinhood.shared.documents.prism.PrismAnimations (PrismComposable.kt:139)");
            }
            float f = 100;
            Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(modifier, C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5171sizeVpY3zN4);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            FaceIconComposable2.FaceIconComposable(prismViewState.getFaceIconAnimationState(), SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), composerStartRestartGroup, 48, 0);
            FlareRingComposable.FlareRingComposable(prismViewState.getShowFlareRing(), SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.startReplaceGroup(26171087);
            if (prismViewState.getShowSuccess()) {
                float f2 = 60;
                PrismCheckmarkComposable.PrismCheckmarkComposable(SizeKt.m5171sizeVpY3zN4(companion2, C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f2)), composerStartRestartGroup, 6, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(26176043);
            if (prismViewState.getShowFailure()) {
                float f3 = 60;
                PrismCrossComposable.PrismCrossComposable(SizeKt.m5171sizeVpY3zN4(companion2, C2002Dp.m7995constructorimpl(f3), C2002Dp.m7995constructorimpl(f3)), composerStartRestartGroup, 6, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.documents.prism.PrismComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrismComposable.PrismAnimations$lambda$7(prismViewState, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CameraEventHandler(final PrismDuxo prismDuxo, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-581418763);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(prismDuxo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-581418763, i2, -1, "com.robinhood.shared.documents.prism.CameraEventHandler (PrismComposable.kt:169)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            final StateFlow<Event<PrismEvent>> eventFlow = prismDuxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.documents.prism.PrismComposableKt$CameraEventHandler$$inlined$collectEventAsStateWithLifecycle$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.documents.prism.PrismComposableKt$CameraEventHandler$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismComposableKt$CameraEventHandler$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "PrismComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.shared.documents.prism.PrismComposableKt$CameraEventHandler$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof PrismEvent) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            Event<PrismEvent> value = eventFlow.getValue();
            Event<PrismEvent> event = value;
            if (!((event != null ? event.getData() : null) instanceof PrismEvent)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner2.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            Event<PrismEvent> eventCameraEventHandler$lambda$8 = CameraEventHandler$lambda$8(snapshotState4CollectAsStateWithLifecycle);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(prismDuxo) | composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                PrismComposable2 prismComposable2 = new PrismComposable2(context, snapshotState4CollectAsStateWithLifecycle, prismDuxo, lifecycleOwner, function0, null);
                composerStartRestartGroup.updateRememberedValue(prismComposable2);
                objRememberedValue = prismComposable2;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(eventCameraEventHandler$lambda$8, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.documents.prism.PrismComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrismComposable.CameraEventHandler$lambda$10(prismDuxo, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trackFace(PrismDuxo prismDuxo, LifecycleOwner lifecycleOwner, ProcessCameraProvider processCameraProvider, Executor executor) {
        ImageAnalysis imageAnalysisBuild = new ImageAnalysis.Builder().build();
        imageAnalysisBuild.setAnalyzer(executor, prismDuxo);
        Intrinsics.checkNotNullExpressionValue(imageAnalysisBuild, "apply(...)");
        processCameraProvider.unbindAll();
        try {
            CameraSelector DEFAULT_FRONT_CAMERA = CameraSelector.DEFAULT_FRONT_CAMERA;
            Intrinsics.checkNotNullExpressionValue(DEFAULT_FRONT_CAMERA, "DEFAULT_FRONT_CAMERA");
            processCameraProvider.bindToLifecycle(lifecycleOwner, DEFAULT_FRONT_CAMERA, imageAnalysisBuild);
        } catch (Exception e) {
            prismDuxo.reportCaptureFailure(PrismCaptureFailedError.CAPTURE_ERROR, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureVideoAndPhoto(final PrismDuxo prismDuxo, LifecycleOwner lifecycleOwner, ProcessCameraProvider processCameraProvider, final Executor executor, final Context context, int i) {
        Quality quality = Quality.f30HD;
        QualitySelector qualitySelectorFrom = QualitySelector.from(quality, FallbackStrategy.lowerQualityThan(quality));
        Intrinsics.checkNotNullExpressionValue(qualitySelectorFrom, "from(...)");
        Recorder recorderBuild = new Recorder.Builder().setQualitySelector(qualitySelectorFrom).setTargetVideoEncodingBitRate(i).build();
        Intrinsics.checkNotNullExpressionValue(recorderBuild, "build(...)");
        VideoCapture videoCaptureWithOutput = VideoCapture.withOutput(recorderBuild);
        Intrinsics.checkNotNullExpressionValue(videoCaptureWithOutput, "withOutput(...)");
        ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setAspectRatioStrategy(AspectRatioStrategy.RATIO_16_9_FALLBACK_AUTO_STRATEGY).setResolutionStrategy(new ResolutionStrategy(new Size(1920, 1080), 4)).build();
        Intrinsics.checkNotNullExpressionValue(resolutionSelectorBuild, "build(...)");
        final ImageCapture imageCaptureBuild = new ImageCapture.Builder().setResolutionSelector(resolutionSelectorBuild).build();
        Intrinsics.checkNotNullExpressionValue(imageCaptureBuild, "build(...)");
        processCameraProvider.unbindAll();
        try {
            CameraSelector DEFAULT_FRONT_CAMERA = CameraSelector.DEFAULT_FRONT_CAMERA;
            Intrinsics.checkNotNullExpressionValue(DEFAULT_FRONT_CAMERA, "DEFAULT_FRONT_CAMERA");
            processCameraProvider.bindToLifecycle(lifecycleOwner, DEFAULT_FRONT_CAMERA, videoCaptureWithOutput, imageCaptureBuild);
            try {
                final ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(File.createTempFile("prism_photo_" + UUID.randomUUID(), ".jpg", context.getCacheDir())).build();
                Intrinsics.checkNotNullExpressionValue(outputFileOptionsBuild, "build(...)");
                try {
                    FileOutputOptions fileOutputOptionsBuild = new FileOutputOptions.Builder(File.createTempFile("prism_video_" + UUID.randomUUID(), ".mp4", context.getCacheDir())).build();
                    Intrinsics.checkNotNullExpressionValue(fileOutputOptionsBuild, "build(...)");
                    PendingRecording pendingRecordingPrepareRecording = ((Recorder) videoCaptureWithOutput.getOutput()).prepareRecording(context, fileOutputOptionsBuild);
                    Intrinsics.checkNotNullExpressionValue(pendingRecordingPrepareRecording, "prepareRecording(...)");
                    Recording recordingStart = pendingRecordingPrepareRecording.start(executor, new Consumer() { // from class: com.robinhood.shared.documents.prism.PrismComposableKt$captureVideoAndPhoto$recording$1
                        @Override // androidx.core.util.Consumer
                        public final void accept(final VideoRecordEvent videoRecordEvent) {
                            if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                                Throwable cause = ((VideoRecordEvent.Finalize) videoRecordEvent).getCause();
                                if (cause != null) {
                                    prismDuxo.reportCaptureFailure(PrismCaptureFailedError.CAPTURE_ERROR, cause);
                                    return;
                                }
                                prismDuxo.onPhotoCaptureStarted();
                                try {
                                    ImageCapture imageCapture = imageCaptureBuild;
                                    ImageCapture.OutputFileOptions outputFileOptions = outputFileOptionsBuild;
                                    Executor executor2 = executor;
                                    final PrismDuxo prismDuxo2 = prismDuxo;
                                    final Context context2 = context;
                                    imageCapture.takePicture(outputFileOptions, executor2, new ImageCapture.OnImageSavedCallback() { // from class: com.robinhood.shared.documents.prism.PrismComposableKt$captureVideoAndPhoto$recording$1.1
                                        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                                        public /* bridge */ /* synthetic */ void onCaptureProcessProgressed(int i2) {
                                            super.onCaptureProcessProgressed(i2);
                                        }

                                        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                                        public /* bridge */ /* synthetic */ void onCaptureStarted() {
                                            super.onCaptureStarted();
                                        }

                                        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                                        public /* bridge */ /* synthetic */ void onPostviewBitmapAvailable(Bitmap bitmap) {
                                            super.onPostviewBitmapAvailable(bitmap);
                                        }

                                        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                                        public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) throws IOException {
                                            Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
                                            Uri savedUri = outputFileResults.getSavedUri();
                                            if (savedUri == null) {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            PrismDuxo prismDuxo3 = prismDuxo2;
                                            Uri outputUri = ((VideoRecordEvent.Finalize) videoRecordEvent).getOutputResults().getOutputUri();
                                            Intrinsics.checkNotNullExpressionValue(outputUri, "getOutputUri(...)");
                                            InputImage inputImageFromFilePath = InputImage.fromFilePath(context2, savedUri);
                                            Intrinsics.checkNotNullExpressionValue(inputImageFromFilePath, "fromFilePath(...)");
                                            prismDuxo3.onCaptureFinished(outputUri, savedUri, inputImageFromFilePath);
                                        }

                                        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                                        public void onError(ImageCaptureException exception) {
                                            Intrinsics.checkNotNullParameter(exception, "exception");
                                            prismDuxo2.reportCaptureFailure(PrismCaptureFailedError.CAPTURE_ERROR, exception);
                                        }
                                    });
                                } catch (Exception e) {
                                    prismDuxo.reportCaptureFailure(PrismCaptureFailedError.CAPTURE_ERROR, e);
                                }
                            }
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(recordingStart, "start(...)");
                    prismDuxo.onVideoCaptureStarted(recordingStart);
                } catch (Exception e) {
                    prismDuxo.reportCaptureFailure(PrismCaptureFailedError.CAPTURE_ERROR, e);
                }
            } catch (Exception e2) {
                prismDuxo.reportCaptureFailure(PrismCaptureFailedError.CAPTURE_ERROR, e2);
            }
        } catch (Exception e3) {
            prismDuxo.reportCaptureFailure(PrismCaptureFailedError.CAPTURE_ERROR, e3);
        }
    }
}
