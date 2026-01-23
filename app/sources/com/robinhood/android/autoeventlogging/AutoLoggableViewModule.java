package com.robinhood.android.autoeventlogging;

import android.view.View;
import com.robinhood.utils.p409ui.view.GlobalOnClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutoLoggableViewModule.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/AutoLoggableViewModule;", "", "<init>", "()V", "provideAnalyticsGlobalClickListener", "Lcom/robinhood/utils/ui/view/GlobalOnClickListener;", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AutoLoggableViewModule {
    public static final AutoLoggableViewModule INSTANCE = new AutoLoggableViewModule();

    private AutoLoggableViewModule() {
    }

    public final GlobalOnClickListener provideAnalyticsGlobalClickListener() {
        return new GlobalOnClickListener() { // from class: com.robinhood.android.autoeventlogging.AutoLoggableViewModule.provideAnalyticsGlobalClickListener.1
            @Override // com.robinhood.utils.p409ui.view.GlobalOnClickListener
            public void onClick(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                ViewsKt.logTap(view);
            }
        };
    }
}
