package com.robinhood.shared.accessibility.provisions;

import com.robinhood.shared.accessibility.RhAccessibilityManager;
import com.robinhood.shared.accessibility.SimpleAccessibilityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: A11yModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/accessibility/provisions/A11yModule;", "", "<init>", "()V", "provideRhAccessibilityManager", "Lcom/robinhood/shared/accessibility/RhAccessibilityManager;", "accessibilityManager", "Lcom/robinhood/shared/accessibility/SimpleAccessibilityManager;", "lib-a11y-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class A11yModule {
    public static final A11yModule INSTANCE = new A11yModule();

    public final RhAccessibilityManager provideRhAccessibilityManager(SimpleAccessibilityManager accessibilityManager) {
        Intrinsics.checkNotNullParameter(accessibilityManager, "accessibilityManager");
        return accessibilityManager;
    }

    private A11yModule() {
    }
}
