package com.squareup.workflow1.p415ui.backstack;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.p415ui.ViewEnvironmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.squareup.workflow1.ui.backstack.BackStackConfig, still in use, count: 1, list:
  (r0v0 com.squareup.workflow1.ui.backstack.BackStackConfig) from 0x002c: SPUT (r0v0 com.squareup.workflow1.ui.backstack.BackStackConfig) (LINE:32) com.squareup.workflow1.ui.backstack.BackStackConfig.default com.squareup.workflow1.ui.backstack.BackStackConfig
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: BackStackConfig.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackConfig;", "", "(Ljava/lang/String;I)V", "None", "First", "Other", "Companion", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class BackStackConfig {
    None,
    First,
    Other;


    /* renamed from: default, reason: not valid java name */
    private static final BackStackConfig f9552default = new BackStackConfig();

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static BackStackConfig valueOf(String str) {
        return (BackStackConfig) Enum.valueOf(BackStackConfig.class, str);
    }

    public static BackStackConfig[] values() {
        return (BackStackConfig[]) $VALUES.clone();
    }

    private BackStackConfig() {
    }

    static {
    }

    /* compiled from: BackStackConfig.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackConfig$Companion;", "Lcom/squareup/workflow1/ui/ViewEnvironmentKey;", "Lcom/squareup/workflow1/ui/backstack/BackStackConfig;", "()V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "getDefault", "()Lcom/squareup/workflow1/ui/backstack/BackStackConfig;", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final class Companion extends ViewEnvironmentKey<BackStackConfig> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(Reflection.getOrCreateKotlinClass(BackStackConfig.class));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.workflow1.p415ui.ViewEnvironmentKey
        public BackStackConfig getDefault() {
            return BackStackConfig.f9552default;
        }
    }
}
