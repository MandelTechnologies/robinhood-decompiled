package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.ScrollableContainerNode;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.key.Key;
import androidx.compose.p011ui.input.key.KeyEvent2;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import androidx.compose.p011ui.node.TraversableNode;
import androidx.compose.p011ui.node.TraversableNode3;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Clickable.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aD\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aX\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a~\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0092\u0001\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u0001*\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0018\u0010\"\u001a\u00020\u0001*\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0018\u0010$\u001a\u00020\u0001*\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!\"\u0018\u0010&\u001a\u00020\u0001*\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "clickable-XHw0xAI", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "clickable", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/Indication;", "indication", "clickable-O2vRcR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "onLongClickLabel", "onLongClick", "onDoubleClick", "hapticFeedbackEnabled", "combinedClickable-f5TDLPQ", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "combinedClickable", "combinedClickable-auXiCPI", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/node/TraversableNode;", "hasScrollableContainer", "(Landroidx/compose/ui/node/TraversableNode;)Z", "Landroidx/compose/ui/input/key/KeyEvent;", "isPress-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isPress", "isClick-ZmokQxo", "isClick", "isEnter-ZmokQxo", "isEnter", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ClickableKt {
    /* renamed from: clickable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4893clickableXHw0xAI$default(Modifier modifier, boolean z, String str, Role role, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m4892clickableXHw0xAI(modifier, z, str, role, function0);
    }

    /* renamed from: clickable-XHw0xAI, reason: not valid java name */
    public static final Modifier m4892clickableXHw0xAI(Modifier modifier, final boolean z, final String str, final Role role, final Function0<Unit> function0) {
        return ComposedModifier2.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("clickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", function0);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                InteractionSource3 interactionSource3;
                composer.startReplaceGroup(-756081143);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-756081143, i, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:120)");
                }
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(617653824);
                    composer.endReplaceGroup();
                    interactionSource3 = null;
                } else {
                    composer.startReplaceGroup(617786442);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    interactionSource3 = (InteractionSource3) objRememberedValue;
                    composer.endReplaceGroup();
                }
                Modifier modifierM4890clickableO2vRcR0 = ClickableKt.m4890clickableO2vRcR0(Modifier.INSTANCE, interactionSource3, indication, z, str, role, function0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM4890clickableO2vRcR0;
            }
        });
    }

    /* renamed from: combinedClickable-f5TDLPQ, reason: not valid java name */
    public static final Modifier m4896combinedClickablef5TDLPQ(Modifier modifier, final boolean z, final String str, final Role role, final String str2, final Function0<Unit> function0, final Function0<Unit> function02, final boolean z2, final Function0<Unit> function03) {
        return ComposedModifier2.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-f5TDLPQ$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("combinedClickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", function03);
                inspectorInfo.getProperties().set("onDoubleClick", function02);
                inspectorInfo.getProperties().set("onLongClick", function0);
                inspectorInfo.getProperties().set("onLongClickLabel", str2);
                inspectorInfo.getProperties().set("hapticFeedbackEnabled", Boolean.valueOf(z2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                InteractionSource3 interactionSource3;
                composer.startReplaceGroup(-1534186401);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1534186401, i, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:264)");
                }
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(-1726068379);
                    composer.endReplaceGroup();
                    interactionSource3 = null;
                } else {
                    composer.startReplaceGroup(-1725935761);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    interactionSource3 = (InteractionSource3) objRememberedValue;
                    composer.endReplaceGroup();
                }
                Modifier modifierM4894combinedClickableauXiCPI = ClickableKt.m4894combinedClickableauXiCPI(Modifier.INSTANCE, interactionSource3, indication, z, str, role, str2, function0, function02, z2, function03);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM4894combinedClickableauXiCPI;
            }
        });
    }

    /* renamed from: clickable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4891clickableO2vRcR0$default(Modifier modifier, InteractionSource3 interactionSource3, Indication indication, boolean z, String str, Role role, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return m4890clickableO2vRcR0(modifier, interactionSource3, indication, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : role, function0);
    }

    /* renamed from: combinedClickable-f5TDLPQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4897combinedClickablef5TDLPQ$default(Modifier modifier, boolean z, String str, Role role, String str2, Function0 function0, Function0 function02, boolean z2, Function0 function03, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            function0 = null;
        }
        if ((i & 32) != 0) {
            function02 = null;
        }
        if ((i & 64) != 0) {
            z2 = true;
        }
        return m4896combinedClickablef5TDLPQ(modifier, z, str, role, str2, function0, function02, z2, function03);
    }

    /* renamed from: combinedClickable-auXiCPI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4895combinedClickableauXiCPI$default(Modifier modifier, InteractionSource3 interactionSource3, Indication indication, boolean z, String str, Role role, String str2, Function0 function0, Function0 function02, boolean z2, Function0 function03, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            role = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            function0 = null;
        }
        if ((i & 128) != 0) {
            function02 = null;
        }
        if ((i & 256) != 0) {
            z2 = true;
        }
        return m4894combinedClickableauXiCPI(modifier, interactionSource3, indication, z, str, role, str2, function0, function02, z2, function03);
    }

    /* renamed from: clickable-O2vRcR0, reason: not valid java name */
    public static final Modifier m4890clickableO2vRcR0(Modifier modifier, InteractionSource3 interactionSource3, final Indication indication, final boolean z, final String str, final Role role, final Function0<Unit> function0) {
        Modifier modifierComposed$default;
        if (indication instanceof IndicationNodeFactory) {
            modifierComposed$default = new ClickableElement(interactionSource3, (IndicationNodeFactory) indication, z, str, role, function0, null);
        } else if (indication == null) {
            modifierComposed$default = new ClickableElement(interactionSource3, null, z, str, role, function0, null);
        } else if (interactionSource3 != null) {
            modifierComposed$default = IndicationKt.indication(Modifier.INSTANCE, interactionSource3, indication).then(new ClickableElement(interactionSource3, null, z, str, role, function0, null));
        } else {
            modifierComposed$default = ComposedModifier2.composed$default(Modifier.INSTANCE, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                    return invoke(modifier2, composer, num.intValue());
                }

                public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                    composer.startReplaceGroup(-1525724089);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1525724089, i, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:473)");
                    }
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
                    Modifier modifierThen = IndicationKt.indication(Modifier.INSTANCE, interactionSource32, indication).then(new ClickableElement(interactionSource32, null, z, str, role, function0, null));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return modifierThen;
                }
            }, 1, null);
        }
        return modifier.then(modifierComposed$default);
    }

    /* renamed from: combinedClickable-auXiCPI, reason: not valid java name */
    public static final Modifier m4894combinedClickableauXiCPI(Modifier modifier, InteractionSource3 interactionSource3, final Indication indication, final boolean z, final String str, final Role role, final String str2, final Function0<Unit> function0, final Function0<Unit> function02, final boolean z2, final Function0<Unit> function03) {
        Modifier modifierComposed$default;
        if (indication instanceof IndicationNodeFactory) {
            modifierComposed$default = new CombinedClickableElement(interactionSource3, (IndicationNodeFactory) indication, z, str, role, function03, str2, function0, function02, z2, null);
        } else if (indication == null) {
            modifierComposed$default = new CombinedClickableElement(interactionSource3, null, z, str, role, function03, str2, function0, function02, z2, null);
        } else if (interactionSource3 != null) {
            modifierComposed$default = IndicationKt.indication(Modifier.INSTANCE, interactionSource3, indication).then(new CombinedClickableElement(interactionSource3, null, z, str, role, function03, str2, function0, function02, z2, null));
        } else {
            modifierComposed$default = ComposedModifier2.composed$default(Modifier.INSTANCE, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-auXiCPI$$inlined$clickableWithIndicationIfNeeded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                    return invoke(modifier2, composer, num.intValue());
                }

                public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                    composer.startReplaceGroup(-1525724089);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1525724089, i, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:473)");
                    }
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
                    Modifier modifierThen = IndicationKt.indication(Modifier.INSTANCE, interactionSource32, indication).then(new CombinedClickableElement(interactionSource32, null, z, str, role, function03, str2, function0, function02, z2, null));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return modifierThen;
                }
            }, 1, null);
        }
        return modifier.then(modifierComposed$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPress-ZmokQxo, reason: not valid java name */
    public static final boolean m4900isPressZmokQxo(KeyEvent keyEvent) {
        return KeyEvent2.m7113equalsimpl0(KeyEvent_androidKt.m7118getTypeZmokQxo(keyEvent), KeyEvent2.INSTANCE.m7114getKeyDownCS__XNY()) && m4899isEnterZmokQxo(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m4898isClickZmokQxo(KeyEvent keyEvent) {
        return KeyEvent2.m7113equalsimpl0(KeyEvent_androidKt.m7118getTypeZmokQxo(keyEvent), KeyEvent2.INSTANCE.m7115getKeyUpCS__XNY()) && m4899isEnterZmokQxo(keyEvent);
    }

    /* renamed from: isEnter-ZmokQxo, reason: not valid java name */
    private static final boolean m4899isEnterZmokQxo(KeyEvent keyEvent) {
        long jM7117getKeyZmokQxo = KeyEvent_androidKt.m7117getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.INSTANCE;
        if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo, companion.m7083getDirectionCenterEK5gGoQ()) ? true : Key.m7078equalsimpl0(jM7117getKeyZmokQxo, companion.m7088getEnterEK5gGoQ()) ? true : Key.m7078equalsimpl0(jM7117getKeyZmokQxo, companion.m7101getNumPadEnterEK5gGoQ())) {
            return true;
        }
        return Key.m7078equalsimpl0(jM7117getKeyZmokQxo, companion.m7104getSpacebarEK5gGoQ());
    }

    public static final boolean hasScrollableContainer(TraversableNode traversableNode) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        TraversableNode3.traverseAncestors(traversableNode, ScrollableContainerNode.INSTANCE, new Function1<TraversableNode, Boolean>() { // from class: androidx.compose.foundation.ClickableKt.hasScrollableContainer.1
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke(TraversableNode traversableNode2) {
                boolean z;
                Ref.BooleanRef booleanRef2 = booleanRef;
                if (!booleanRef2.element) {
                    Intrinsics.checkNotNull(traversableNode2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    z = ((ScrollableContainerNode) traversableNode2).getEnabled();
                }
                booleanRef2.element = z;
                return Boolean.valueOf(!booleanRef.element);
            }
        });
        return booleanRef.element;
    }
}
