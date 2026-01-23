package com.withpersona.sdk2.inquiry.shared.systemUiController;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.p415ui.ViewEnvironmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;

/* compiled from: SystemUiControllerKey.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/systemUiController/SystemUiControllerKey;", "Lcom/squareup/workflow1/ui/ViewEnvironmentKey;", "Lcom/withpersona/sdk2/inquiry/shared/systemUiController/SystemUiController;", "<init>", "()V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "getDefault", "()Lcom/withpersona/sdk2/inquiry/shared/systemUiController/SystemUiController;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SystemUiControllerKey extends ViewEnvironmentKey<SystemUiController> {
    public static final SystemUiControllerKey INSTANCE = new SystemUiControllerKey();

    private SystemUiControllerKey() {
        super(Reflection.getOrCreateKotlinClass(SystemUiController.class));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.workflow1.p415ui.ViewEnvironmentKey
    public SystemUiController getDefault() {
        throw new IllegalStateException("Unset");
    }
}
