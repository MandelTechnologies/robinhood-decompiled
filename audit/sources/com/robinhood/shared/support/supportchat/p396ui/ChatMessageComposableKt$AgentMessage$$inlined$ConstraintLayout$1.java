package com.robinhood.shared.support.supportchat.p396ui;

import android.content.res.Resources;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.shared.support.supportchat.p396ui.ChatMessageComposable;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ChatMessageComposableKt$AgentMessage$$inlined$ConstraintLayout$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ RoundedCornerShape $bubbleShape$inlined;
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ UUID $inquiryId$inlined;
    final /* synthetic */ boolean $isSelectionMenu$inlined;
    final /* synthetic */ UiChatMessage.Regular $message$inlined;
    final /* synthetic */ Function1 $onClickAction$inlined;
    final /* synthetic */ Function1 $onClickMessageBubble$inlined;
    final /* synthetic */ Function1 $onClickUserSelectionRow$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageComposableKt$AgentMessage$$inlined$ConstraintLayout$1(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, UiChatMessage.Regular regular, boolean z, UUID uuid, RoundedCornerShape roundedCornerShape, Function1 function1, Function1 function12, Function1 function13) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$message$inlined = regular;
        this.$isSelectionMenu$inlined = z;
        this.$inquiryId$inlined = uuid;
        this.$bubbleShape$inlined = roundedCornerShape;
        this.$onClickMessageBubble$inlined = function1;
        this.$onClickAction$inlined = function12;
        this.$onClickUserSelectionRow$inlined = function13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
        Integer numValueOf;
        int i2;
        Composer composer2 = composer;
        if ((i & 3) != 2 || !composer2.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
            }
            this.$contentTracker.setValue(Unit.INSTANCE);
            if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
                this.$compositionSource.setValue(CompositionSource.Content);
            }
            this.$scope.reset();
            ConstraintLayoutScope constraintLayoutScope = this.$scope;
            composer2.startReplaceGroup(-1051200517);
            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer2.startReplaceGroup(5004770);
            boolean zChanged = composer2.changed(constraintLayoutBaseScope4Component1);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ChatMessageComposable2(constraintLayoutBaseScope4Component1);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierConstrainAs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            UiChatMessage.Regular regular = this.$message$inlined;
            UiChatMessage.Regular.Action action = regular instanceof UiChatMessage.Regular.Action ? (UiChatMessage.Regular.Action) regular : null;
            MessageBubbleThemeOverlay.AgentMessageBubbleThemeOverlay(action != null ? action.getStyle() : null, this.$isSelectionMenu$inlined, ComposableLambda3.rememberComposableLambda(781888662, true, new ChatMessageComposable3(this.$message$inlined, this.$inquiryId$inlined, this.$bubbleShape$inlined, this.$onClickMessageBubble$inlined, this.$onClickAction$inlined, this.$onClickUserSelectionRow$inlined), composer2, 54), composer2, 384, 0);
            composer2.endNode();
            if (this.$message$inlined.getShowAvatar()) {
                int i3 = ChatMessageComposable.WhenMappings.$EnumSwitchMapping$0[this.$message$inlined.getSenderType().ordinal()];
                if (i3 == 1) {
                    numValueOf = null;
                } else if (i3 == 2) {
                    numValueOf = Integer.valueOf(C20690R.drawable.pict_mono_rds_robinhood);
                } else if (i3 != 3) {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(C20690R.drawable.pict_mono_rds_agent);
                }
            }
            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(32));
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component2) | composer2.changed(numValueOf);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ChatMessageComposable4(constraintLayoutBaseScope4Component2, numValueOf);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(constraintLayoutScope.constrainAs(modifierM5169size3ABfNKs, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue2), 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            composer2.startReplaceGroup(-606399651);
            if (numValueOf == null) {
                i2 = 0;
            } else {
                int iIntValue = numValueOf.intValue();
                Modifier modifierAlign = boxScopeInstance.align(TestTag3.testTag(companion, "Avatar"), companion2.getCenter());
                i2 = 0;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(iIntValue, modifierAlign, false, null, null, null, null, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                composer2 = composer;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.startReplaceGroup(5004770);
            boolean zChanged3 = composer2.changed(constraintLayoutBaseScope4Component2);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new ChatMessageComposable5(constraintLayoutBaseScope4Component2);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceGroup();
            ChatMessageComposable.MetadataText(this.$message$inlined.getMetadata(), constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue3), composer2, i2, i2);
            composer2.endReplaceGroup();
            boolean zChangedInstance = composer2.changedInstance(this.$scope) | composer2.changedInstance(this.$channel);
            final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
            final SnapshotState snapshotState = this.$start;
            final SnapshotState snapshotState2 = this.$end;
            final Channel channel = this.$channel;
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0<Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$AgentMessage$$inlined$ConstraintLayout$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope2.getContainerObject().mo8187clone());
                        if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                            snapshotState.setValue(constraintSet3);
                            snapshotState2.setValue(snapshotState.getValue());
                        } else {
                            channel.mo8337trySendJP2dKIU(constraintSet3);
                        }
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.SideEffect((Function0) objRememberedValue4, composer2, i2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer2.skipToGroupEnd();
    }
}
