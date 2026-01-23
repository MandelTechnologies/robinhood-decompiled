package com.robinhood.utils.compose.extensions;

import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u001a$\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u001aG\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"clearSemanticsIf", "Landroidx/compose/ui/Modifier;", "condition", "", "setContentDescription", "contentDescription", "", "mergeDescendants", "setContentDescriptionIf", "pressable", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "pressedAlpha", "", "onPressed", "Lkotlin/Function1;", "", "onClick", "Lkotlin/Function0;", "pressable-iJQMabo", "(Landroidx/compose/ui/Modifier;JFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "lib-utils-compose_externalDebug", "pressed", "currentColor"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ModifiersKt {
    public static final Modifier clearSemanticsIf(Modifier modifier, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return z ? SemanticsModifier6.clearAndSetSemantics(modifier, new Function1() { // from class: com.robinhood.utils.compose.extensions.ModifiersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifiersKt.clearSemanticsIf$lambda$0((SemanticsPropertyReceiver) obj);
            }
        }) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearSemanticsIf$lambda$0(SemanticsPropertyReceiver clearAndSetSemantics) {
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Modifier setContentDescription$default(Modifier modifier, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return setContentDescription(modifier, str, z);
    }

    public static final Modifier setContentDescription(Modifier modifier, final String contentDescription, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        return SemanticsModifier6.semantics(modifier, z, new Function1() { // from class: com.robinhood.utils.compose.extensions.ModifiersKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifiersKt.setContentDescription$lambda$1(contentDescription, (SemanticsPropertyReceiver) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setContentDescription$lambda$1(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Modifier setContentDescriptionIf$default(Modifier modifier, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return setContentDescriptionIf(modifier, z, str, z2);
    }

    public static final Modifier setContentDescriptionIf(Modifier modifier, boolean z, final String contentDescription, boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        return z ? SemanticsModifier6.semantics(modifier, z2, new Function1() { // from class: com.robinhood.utils.compose.extensions.ModifiersKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifiersKt.setContentDescriptionIf$lambda$2(contentDescription, (SemanticsPropertyReceiver) obj);
            }
        }) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setContentDescriptionIf$lambda$2(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        return Unit.INSTANCE;
    }

    /* renamed from: pressable-iJQMabo$default, reason: not valid java name */
    public static /* synthetic */ Modifier m26603pressableiJQMabo$default(Modifier modifier, long j, float f, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.6f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            function1 = new Function1<Color, Unit>() { // from class: com.robinhood.utils.compose.extensions.ModifiersKt$pressable$1
                /* renamed from: invoke-8_81llA, reason: not valid java name */
                public final void m26604invoke8_81llA(long j2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Color color) {
                    m26604invoke8_81llA(color.getValue());
                    return Unit.INSTANCE;
                }
            };
        }
        return m26602pressableiJQMabo(modifier, j, f2, function1, function0);
    }

    /* renamed from: pressable-iJQMabo, reason: not valid java name */
    public static final Modifier m26602pressableiJQMabo(Modifier pressable, long j, float f, Function1<? super Color, Unit> onPressed, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(pressable, "$this$pressable");
        Intrinsics.checkNotNullParameter(onPressed, "onPressed");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifier2.composed$default(pressable, null, new ModifiersKt$pressable$2(j, f, onPressed, onClick), 1, null);
    }
}
