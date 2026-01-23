package com.robinhood.shared.posttransfer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoBanner2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimeline2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.truelayer.TrueLayerSession;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.models.api.bonfire.transfer.ApiInitialPostTransferTimelineAction;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.robinhood.models.serverdriven.experimental.api.PostTransferAction;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.Either2;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import dagger.Lazy;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: DynamicPostTransferTimelineFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001;\b\u0007\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0003KLMB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0016J\u001a\u0010D\u001a\u00020A2\u0006\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\r\u0010I\u001a\u00020AH\u0017¢\u0006\u0002\u0010JR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R+\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020+8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00103\u001a\u000204X\u0082.¢\u0006\u0002\n\u0000R\u001b\u00105\u001a\u0002068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b9\u0010#\u001a\u0004\b7\u00108R\u0010\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0004\n\u0002\u0010<R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "getTargetBackend", "()Lcom/robinhood/targetbackend/TargetBackend;", "setTargetBackend", "(Lcom/robinhood/targetbackend/TargetBackend;)V", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "getHistoryNavigator", "()Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "setHistoryNavigator", "(Lcom/robinhood/shared/history/navigation/HistoryNavigator;)V", "rhProcessLifecycleOwner", "Ldagger/Lazy;", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "getRhProcessLifecycleOwner", "()Ldagger/Lazy;", "setRhProcessLifecycleOwner", "(Ldagger/Lazy;)V", "duxo", "Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineDuxo;", "getDuxo", "()Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "", "hasTriggeredAction", "getHasTriggeredAction", "()Z", "setHasTriggeredAction", "(Z)V", "hasTriggeredAction$delegate", "Lkotlin/properties/ReadWriteProperty;", "trueLayerSession", "Lcom/robinhood/android/truelayer/TrueLayerSession;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "genericActionHandler", "com/robinhood/shared/posttransfer/DynamicPostTransferTimelineFragment$genericActionHandler$1", "Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineFragment$genericActionHandler$1;", "postTransferActionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/PostTransferAction;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class DynamicPostTransferTimelineFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public HistoryNavigator historyNavigator;
    public Markwon markwon;
    public Lazy<RhProcessLifecycleOwner> rhProcessLifecycleOwner;
    public TargetBackend targetBackend;
    private TrueLayerSession trueLayerSession;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DynamicPostTransferTimelineFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DynamicPostTransferTimelineFragment.class, "hasTriggeredAction", "getHasTriggeredAction()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy duxo = DuxosKt.duxo(this, DynamicPostTransferTimelineDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof DynamicPostTransferTimelineFragment.Callbacks)) {
                parentFragment = null;
            }
            DynamicPostTransferTimelineFragment.Callbacks callbacks = (DynamicPostTransferTimelineFragment.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof DynamicPostTransferTimelineFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: hasTriggeredAction$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasTriggeredAction = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[1]);

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DynamicPostTransferTimelineFragment.eventScreen_delegate$lambda$0();
        }
    });
    private final DynamicPostTransferTimelineFragment4 genericActionHandler = new SduiActionHandler<GenericAction>() { // from class: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment$genericActionHandler$1
        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
        /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo15941handle(GenericAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action instanceof GenericAction.InfoAlert) {
                DynamicPostTransferTimelineFragment dynamicPostTransferTimelineFragment = this.this$0;
                SduiAlertKt.presentSduiAlertSheet(dynamicPostTransferTimelineFragment, dynamicPostTransferTimelineFragment.getMarkwon(), ((GenericAction.InfoAlert) action).getValue2().getAlert(), this, (1016 & 8) != 0 ? 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0026: INVOKE 
                      (r0v11 'dynamicPostTransferTimelineFragment' com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment)
                      (wrap:io.noties.markwon.Markwon:0x000c: INVOKE (r0v11 'dynamicPostTransferTimelineFragment' com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment) VIRTUAL call: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment.getMarkwon():io.noties.markwon.Markwon A[MD:():io.noties.markwon.Markwon (m), WRAPPED] (LINE:96))
                      (wrap:com.robinhood.models.serverdriven.experimental.api.GenericAlertContent:0x0017: INVOKE 
                      (wrap:com.robinhood.models.serverdriven.experimental.api.AlertAction:0x0013: INVOKE 
                      (wrap:com.robinhood.models.serverdriven.experimental.api.GenericAction$InfoAlert:0x0011: CHECK_CAST (com.robinhood.models.serverdriven.experimental.api.GenericAction$InfoAlert) (r15v0 'action' com.robinhood.models.serverdriven.experimental.api.GenericAction))
                     VIRTUAL call: com.robinhood.models.serverdriven.experimental.api.GenericAction.InfoAlert.getValue():com.robinhood.models.serverdriven.experimental.api.AlertAction A[MD:():java.lang.Object (m), WRAPPED] (LINE:97))
                     VIRTUAL call: com.robinhood.models.serverdriven.experimental.api.AlertAction.getAlert():com.robinhood.models.serverdriven.experimental.api.GenericAlertContent A[MD:():com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<ActionT extends android.os.Parcelable> (m), WRAPPED] (LINE:97))
                      (r14v0 'this' com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment$genericActionHandler$1 A[IMMUTABLE_TYPE, THIS])
                      (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0002: ARITH (1016 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:520) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
                      (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000f: ARITH (1016 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:521) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda1.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
                      (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001c: ARITH (1016 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:522) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda2.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                      (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (1016 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : false)
                      (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (1016 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : false)
                      (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (1016 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : false)
                      (wrap:com.robinhood.android.common.ui.RhButtonType:?: TERNARY null = ((wrap:int:0x0043: ARITH (1016 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.robinhood.android.common.ui.RhButtonType) : (null com.robinhood.android.common.ui.RhButtonType))
                     STATIC call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void A[MD:<ActionT extends android.os.Parcelable>:(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<? extends ActionT extends android.os.Parcelable>, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<? super ActionT extends android.os.Parcelable>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void (m)] (LINE:516) in method: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment$genericActionHandler$1.handle(com.robinhood.models.serverdriven.experimental.api.GenericAction):boolean, file: classes6.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 23 more
                    */
                /*
                    this = this;
                    java.lang.String r1 = "action"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
                    boolean r1 = r15 instanceof com.robinhood.models.serverdriven.experimental.api.GenericAction.InfoAlert
                    r13 = 1
                    if (r1 == 0) goto L2a
                    com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment r0 = r14.this$0
                    io.noties.markwon.Markwon r1 = r0.getMarkwon()
                    r2 = r15
                    com.robinhood.models.serverdriven.experimental.api.GenericAction$InfoAlert r2 = (com.robinhood.models.serverdriven.experimental.api.GenericAction.InfoAlert) r2
                    com.robinhood.models.serverdriven.experimental.api.AlertAction r2 = r2.getValue2()
                    com.robinhood.models.serverdriven.experimental.api.GenericAlertContent r2 = r2.getAlert()
                    r11 = 1016(0x3f8, float:1.424E-42)
                    r12 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r3 = r14
                    com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    return r13
                L2a:
                    boolean r0 = r15 instanceof com.robinhood.models.serverdriven.experimental.api.GenericAction.Deeplink
                    if (r0 == 0) goto L5a
                    com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment r0 = r14.this$0
                    com.robinhood.android.navigation.Navigator r4 = r0.getNavigator()
                    com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment r0 = r14.this$0
                    android.content.Context r5 = r0.requireContext()
                    java.lang.String r0 = "requireContext(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
                    r0 = r15
                    com.robinhood.models.serverdriven.experimental.api.GenericAction$Deeplink r0 = (com.robinhood.models.serverdriven.experimental.api.GenericAction.Deeplink) r0
                    com.robinhood.models.serverdriven.experimental.api.DeeplinkAction r0 = r0.getValue2()
                    java.lang.String r0 = r0.getUri()
                    android.net.Uri r6 = android.net.Uri.parse(r0)
                    r11 = 60
                    r12 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    boolean r0 = com.robinhood.android.navigation.Navigator.DefaultImpls.handleDeepLink$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    return r0
                L5a:
                    boolean r0 = r15 instanceof com.robinhood.models.serverdriven.experimental.api.GenericAction.Dismiss
                    if (r0 == 0) goto L5f
                    return r13
                L5f:
                    kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                    r0.<init>()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment4.mo15941handle(com.robinhood.models.serverdriven.experimental.api.GenericAction):boolean");
            }
        };
        private final SduiActionHandler<PostTransferAction> postTransferActionHandler = new SduiActionHandler() { // from class: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment$postTransferActionHandler$1
            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
            /* renamed from: handle, reason: merged with bridge method [inline-methods] */
            public final boolean mo15941handle(PostTransferAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                if (action instanceof PostTransferAction.InfoAlert) {
                    throw new IllegalStateException("Info Alert not supported for PostTransferActions!");
                }
                if (action instanceof PostTransferAction.Deeplink) {
                    Navigator navigator = this.this$0.getNavigator();
                    Context contextRequireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    return Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((PostTransferAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
                }
                if (action instanceof PostTransferAction.Dismiss) {
                    this.this$0.getCallbacks().onDismiss();
                    return true;
                }
                if (!(action instanceof PostTransferAction.ViewTransferDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                Navigator navigator2 = this.this$0.getNavigator();
                Context contextRequireContext2 = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                HistoryNavigator historyNavigator = this.this$0.getHistoryNavigator();
                UUID uuidFromString = UUID.fromString(((DynamicPostTransferTimelineFragment.Args) DynamicPostTransferTimelineFragment.INSTANCE.getArgs((Fragment) this.this$0)).getTransferId());
                Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
                Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, new HostIntentKey.ShowFragmentInStandaloneActivity(HistoryNavigator.resolve$default(historyNavigator, new TransactionReference(uuidFromString, HistoryTransactionType.UK_BANK_TRANSFER, null, null, false, 28, null), false, false, 6, null), false, 2, null), null, false, null, null, 60, null);
                return true;
            }
        };

        /* compiled from: DynamicPostTransferTimelineFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineFragment$Callbacks;", "", "onDismiss", "", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface Callbacks {
            void onDismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit ComposeContent$lambda$3(DynamicPostTransferTimelineFragment dynamicPostTransferTimelineFragment, int i, Composer composer, int i2) {
            dynamicPostTransferTimelineFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
            return Unit.INSTANCE;
        }

        @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
        public boolean getExcludeFromAutoScreenAppearEventLogging() {
            return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
        }

        @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
        public boolean getExcludeFromAutoScreenDisappearEventLogging() {
            return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
        }

        @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
        public boolean getExcludeFromAutoScreenEventLogging() {
            return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
        }

        @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
        public boolean getExcludeFromAutoScreenSourceEventLogging() {
            return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
        }

        @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
        public Component getScreenEventComponent() {
            return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
        }

        @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
        public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
            return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
        }

        @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
        public UserInteractionEventData getScreenEventData() {
            return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
        }

        public final Markwon getMarkwon() {
            Markwon markwon = this.markwon;
            if (markwon != null) {
                return markwon;
            }
            Intrinsics.throwUninitializedPropertyAccessException("markwon");
            return null;
        }

        public final void setMarkwon(Markwon markwon) {
            Intrinsics.checkNotNullParameter(markwon, "<set-?>");
            this.markwon = markwon;
        }

        public final TargetBackend getTargetBackend() {
            TargetBackend targetBackend = this.targetBackend;
            if (targetBackend != null) {
                return targetBackend;
            }
            Intrinsics.throwUninitializedPropertyAccessException("targetBackend");
            return null;
        }

        public final void setTargetBackend(TargetBackend targetBackend) {
            Intrinsics.checkNotNullParameter(targetBackend, "<set-?>");
            this.targetBackend = targetBackend;
        }

        public final HistoryNavigator getHistoryNavigator() {
            HistoryNavigator historyNavigator = this.historyNavigator;
            if (historyNavigator != null) {
                return historyNavigator;
            }
            Intrinsics.throwUninitializedPropertyAccessException("historyNavigator");
            return null;
        }

        public final void setHistoryNavigator(HistoryNavigator historyNavigator) {
            Intrinsics.checkNotNullParameter(historyNavigator, "<set-?>");
            this.historyNavigator = historyNavigator;
        }

        public final Lazy<RhProcessLifecycleOwner> getRhProcessLifecycleOwner() {
            Lazy<RhProcessLifecycleOwner> lazy = this.rhProcessLifecycleOwner;
            if (lazy != null) {
                return lazy;
            }
            Intrinsics.throwUninitializedPropertyAccessException("rhProcessLifecycleOwner");
            return null;
        }

        public final void setRhProcessLifecycleOwner(Lazy<RhProcessLifecycleOwner> lazy) {
            Intrinsics.checkNotNullParameter(lazy, "<set-?>");
            this.rhProcessLifecycleOwner = lazy;
        }

        private final DynamicPostTransferTimelineDuxo getDuxo() {
            return (DynamicPostTransferTimelineDuxo) this.duxo.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Callbacks getCallbacks() {
            return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
        }

        private final boolean getHasTriggeredAction() {
            return ((Boolean) this.hasTriggeredAction.getValue(this, $$delegatedProperties[1])).booleanValue();
        }

        private final void setHasTriggeredAction(boolean z) {
            this.hasTriggeredAction.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
        }

        @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
        public Screen getEventScreen() {
            return (Screen) this.eventScreen.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Screen eventScreen_delegate$lambda$0() {
            return new Screen(Screen.Name.POST_TRANSFER_CONFIRMATION, null, null, null, 14, null);
        }

        @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
        public void onAttach(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            super.onAttach(context);
            this.trueLayerSession = new TrueLayerSession(Either2.asLeft(this), getTargetBackend());
        }

        @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
        public void onViewCreated(View view, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(view, "view");
            super.onViewCreated(view, savedInstanceState);
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
            if (getHasTriggeredAction()) {
                return;
            }
            ApiInitialPostTransferTimelineAction action = ((Args) INSTANCE.getArgs((Fragment) this)).getTimeline().getAction();
            if (action instanceof ApiInitialPostTransferTimelineAction.TrueLayerProcessPaymentAction) {
                getRhProcessLifecycleOwner().get().useExtendedTimeout();
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new DynamicPostTransferTimelineFragment5(this, action, null), 3, null);
            } else {
                if (action instanceof ApiInitialPostTransferTimelineAction.Unknown) {
                    throw new IllegalStateException("Unknown timeline action!");
                }
                if (action != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            setHasTriggeredAction(true);
        }

        @Override // com.robinhood.compose.app.GenericComposeFragment
        @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
        public void ComposeContent(Composer composer, final int i) {
            int i2;
            Composer composerStartRestartGroup = composer.startRestartGroup(1132933086);
            if ((i & 6) == 0) {
                i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1132933086, i2, -1, "com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment.ComposeContent (DynamicPostTransferTimelineFragment.kt:192)");
                }
                final ApiPostTransferPage.DynamicPostTransferTimeline timeline = ((DynamicPostTransferTimelineViewState) FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue()).getTimeline();
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1745170398, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment$ComposeContent$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1745170398, i3, -1, "com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment.ComposeContent.<anonymous>.<anonymous> (DynamicPostTransferTimelineFragment.kt:201)");
                        }
                        final ApiPostTransferPage.DynamicPostTransferTimeline dynamicPostTransferTimeline = timeline;
                        final DynamicPostTransferTimelineFragment dynamicPostTransferTimelineFragment = this;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-303074963, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment$ComposeContent$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i4) {
                                if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-303074963, i4, -1, "com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (DynamicPostTransferTimelineFragment.kt:202)");
                                }
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i5 = BentoTheme.$stable;
                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i5).m21371getBg0d7_KjU();
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer3, i5).m21590getDefaultD9Ej5fM(), 1, null);
                                final ApiPostTransferPage.DynamicPostTransferTimeline dynamicPostTransferTimeline2 = dynamicPostTransferTimeline;
                                final DynamicPostTransferTimelineFragment dynamicPostTransferTimelineFragment2 = dynamicPostTransferTimelineFragment;
                                ScaffoldKt.m5625Scaffold27mzLpw(modifierM5144paddingVpY3zN4$default, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, 0L, ComposableLambda3.rememberComposableLambda(1281115435, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment.ComposeContent.1.1.1.1
                                    /* JADX WARN: Type inference failed for: r11v10 */
                                    /* JADX WARN: Type inference failed for: r11v7 */
                                    /* JADX WARN: Type inference failed for: r11v8, types: [boolean, int] */
                                    /* JADX WARN: Type inference failed for: r14v4 */
                                    /* JADX WARN: Type inference failed for: r14v5, types: [boolean, int] */
                                    /* JADX WARN: Type inference failed for: r14v6 */
                                    public final void invoke(PaddingValues unused$var$, Composer composer4, int i6) {
                                        int i7;
                                        int i8;
                                        Modifier.Companion companion;
                                        ?? r11;
                                        float f;
                                        ?? r14;
                                        Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
                                        if ((i6 & 17) == 16 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1281115435, i6, -1, "com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DynamicPostTransferTimelineFragment.kt:208)");
                                        }
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                        final ApiPostTransferPage.DynamicPostTransferTimeline dynamicPostTransferTimeline3 = dynamicPostTransferTimeline2;
                                        DynamicPostTransferTimelineFragment dynamicPostTransferTimelineFragment3 = dynamicPostTransferTimelineFragment2;
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        Arrangement.Vertical top = arrangement.getTop();
                                        Alignment.Companion companion3 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer4, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierFillMaxSize$default);
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        Modifier.Companion companion5 = companion2;
                                        BentoRichText.m15949BentoRichText0sCZWFg(dynamicPostTransferTimeline3.getTimeline_title(), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer4, i9).m21593getSmallD9Ej5fM(), 7, null), 0.0f, composer4, 0, 1), bentoTheme2.getTypography(composer4, i9).getDisplayCapsuleMedium(), 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composer4, 0, 1016);
                                        RichText timeline_subtitle = dynamicPostTransferTimeline3.getTimeline_subtitle();
                                        composer4.startReplaceGroup(-1053212835);
                                        if (timeline_subtitle == null) {
                                            i7 = i9;
                                        } else {
                                            TextStyle textM = bentoTheme2.getTypography(composer4, i9).getTextM();
                                            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer4, i9).m21593getSmallD9Ej5fM(), 7, null), bentoTheme2.getSpacing(composer4, i9).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                                            companion5 = companion5;
                                            i7 = i9;
                                            BentoRichText.m15949BentoRichText0sCZWFg(timeline_subtitle, modifierM5144paddingVpY3zN4$default2, textM, 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composer4, 0, 1016);
                                        }
                                        composer4.endReplaceGroup();
                                        InfoBanner<GenericAction> timeline_info_banner = dynamicPostTransferTimeline3.getTimeline_info_banner();
                                        composer4.startReplaceGroup(-1053193865);
                                        if (timeline_info_banner == null) {
                                            companion = companion5;
                                            i8 = i7;
                                            r11 = 1;
                                            f = 0.0f;
                                            r14 = 0;
                                        } else {
                                            i8 = i7;
                                            float fM21592getMediumD9Ej5fM = bentoTheme2.getSpacing(composer4, i8).m21592getMediumD9Ej5fM();
                                            float fM21590getDefaultD9Ej5fM = bentoTheme2.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM();
                                            Modifier.Companion companion6 = companion5;
                                            companion = companion6;
                                            r11 = 1;
                                            f = 0.0f;
                                            r14 = 0;
                                            SduiInfoBanner2.SduiInfoBanner(timeline_info_banner, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, fM21592getMediumD9Ej5fM, 0.0f, fM21590getDefaultD9Ej5fM, 5, null), 0.0f, composer4, 0, 1), composer4, 0, 0);
                                        }
                                        composer4.endReplaceGroup();
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer4, i8).m21592getMediumD9Ej5fM()), composer4, r14);
                                        SduiActionHandler3.ProvideActionHandler(dynamicPostTransferTimelineFragment3.genericActionHandler, ComposableLambda3.rememberComposableLambda(1742930370, r11, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment$ComposeContent$1$1$1$1$1$3
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i10) {
                                                if ((i10 & 3) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1742930370, i10, -1, "com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DynamicPostTransferTimelineFragment.kt:246)");
                                                }
                                                SduiTimeline2.SduiTimeline(dynamicPostTransferTimeline3.getTimeline(), null, null, 5, true, composer5, 27648, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54), composer4, 48);
                                        BoxKt.Box(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer4, r14);
                                        SduiActionHandler sduiActionHandler = dynamicPostTransferTimelineFragment3.postTransferActionHandler;
                                        ImmutableList3 persistentList = extensions2.toPersistentList(dynamicPostTransferTimeline3.getTimeline_footer());
                                        Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, f, r11, null), null, r14, 3, null);
                                        composer4.startReplaceGroup(-1772220517);
                                        SduiColumns.SduiColumn(persistentList, PostTransferAction.class, modifierWrapContentHeight$default, null, sduiActionHandler, HorizontalPadding.Default, arrangement.getTop(), companion3.getStart(), true, composer4, 100663680, 0);
                                        composer4.endReplaceGroup();
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                        invoke(paddingValues, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 0, 12582912, 98302);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DynamicPostTransferTimelineFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* compiled from: DynamicPostTransferTimelineFragment.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineFragment$Args;", "Landroid/os/Parcelable;", "transferId", "", "timeline", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$InitialPostTransferTimeline;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$InitialPostTransferTimeline;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;)V", "getTransferId", "()Ljava/lang/String;", "getTimeline", "()Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$InitialPostTransferTimeline;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Args implements Parcelable {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Args> CREATOR = new Creator();
            private final MAXTransferContext.EntryPoint entryPoint;
            private final UiPostTransferPage.InitialPostTransferTimeline timeline;
            private final String transferId;

            /* compiled from: DynamicPostTransferTimelineFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Args> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Args createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Args(parcel.readString(), (UiPostTransferPage.InitialPostTransferTimeline) parcel.readParcelable(Args.class.getClassLoader()), MAXTransferContext.EntryPoint.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Args[] newArray(int i) {
                    return new Args[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.transferId);
                dest.writeParcelable(this.timeline, flags);
                dest.writeString(this.entryPoint.name());
            }

            public Args(String transferId, UiPostTransferPage.InitialPostTransferTimeline timeline, MAXTransferContext.EntryPoint entryPoint) {
                Intrinsics.checkNotNullParameter(transferId, "transferId");
                Intrinsics.checkNotNullParameter(timeline, "timeline");
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                this.transferId = transferId;
                this.timeline = timeline;
                this.entryPoint = entryPoint;
            }

            public final String getTransferId() {
                return this.transferId;
            }

            public final UiPostTransferPage.InitialPostTransferTimeline getTimeline() {
                return this.timeline;
            }

            public final MAXTransferContext.EntryPoint getEntryPoint() {
                return this.entryPoint;
            }
        }

        /* compiled from: DynamicPostTransferTimelineFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineFragment;", "Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineFragment$Args;", "<init>", "()V", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements FragmentWithArgsCompanion<DynamicPostTransferTimelineFragment, Args> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
            public Args getArgs(DynamicPostTransferTimelineFragment dynamicPostTransferTimelineFragment) {
                return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, dynamicPostTransferTimelineFragment);
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
            public DynamicPostTransferTimelineFragment newInstance(Args args) {
                return (DynamicPostTransferTimelineFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
            public void setArgs(DynamicPostTransferTimelineFragment dynamicPostTransferTimelineFragment, Args args) {
                FragmentWithArgsCompanion.DefaultImpls.setArgs(this, dynamicPostTransferTimelineFragment, args);
            }
        }
    }
