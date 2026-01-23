package com.robinhood.android.event.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventDetailAboutsSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.ComposableSingletons$EventDetailAboutsSectionKt$lambda$172443697$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EventDetailAboutsSection2 implements Function2<Composer, Integer, Unit> {
    public static final EventDetailAboutsSection2 INSTANCE = new EventDetailAboutsSection2();

    EventDetailAboutsSection2() {
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
            ComposerKt.traceEventStart(172443697, i, -1, "com.robinhood.android.event.detail.ComposableSingletons$EventDetailAboutsSectionKt.lambda$172443697.<anonymous> (EventDetailAboutsSection.kt:97)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.event.detail.ComposableSingletons$EventDetailAboutsSectionKt$lambda$172443697$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EventDetailAboutsSection3.EventDetailAboutsSection("About text", (Function0) objRememberedValue, null, composer, 54, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
