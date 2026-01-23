package com.robinhood.android.onboarding.p205ui.postsignup.helm;

import com.robinhood.rhc.upsells.Upsell;
import com.robinhood.utils.logging.CrashReporter;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HelmSubFlow.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmSubFlow;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "INTRO", "BANK_LINKING", "GB_QUEUED_DEPOSIT", "NATIVE_FUNDING_UPSELL", "FIRST_DEPOSIT", "RECURRING_DEPOSIT", "DOC_UPLOAD", "GB_VERIFY_IDENTITY", "POST_FUNDING_UPSELL", "REFERRAL", "THANK_YOU", "UNKNOWN", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class HelmSubFlow {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HelmSubFlow[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String id;
    public static final HelmSubFlow INTRO = new HelmSubFlow("INTRO", 0, "intro");
    public static final HelmSubFlow BANK_LINKING = new HelmSubFlow("BANK_LINKING", 1, "bank_linking");
    public static final HelmSubFlow GB_QUEUED_DEPOSIT = new HelmSubFlow("GB_QUEUED_DEPOSIT", 2, "gb_queued_deposit");
    public static final HelmSubFlow NATIVE_FUNDING_UPSELL = new HelmSubFlow("NATIVE_FUNDING_UPSELL", 3, "native_funding_upsell");
    public static final HelmSubFlow FIRST_DEPOSIT = new HelmSubFlow("FIRST_DEPOSIT", 4, "first_deposit");
    public static final HelmSubFlow RECURRING_DEPOSIT = new HelmSubFlow("RECURRING_DEPOSIT", 5, "recurring_deposit");
    public static final HelmSubFlow DOC_UPLOAD = new HelmSubFlow("DOC_UPLOAD", 6, "doc_upload");
    public static final HelmSubFlow GB_VERIFY_IDENTITY = new HelmSubFlow("GB_VERIFY_IDENTITY", 7, "gb_verify_identity");
    public static final HelmSubFlow POST_FUNDING_UPSELL = new HelmSubFlow("POST_FUNDING_UPSELL", 8, "m1_onboarding_post_funding_upsell");
    public static final HelmSubFlow REFERRAL = new HelmSubFlow("REFERRAL", 9, Upsell.Single.Referral.f5956ID);
    public static final HelmSubFlow THANK_YOU = new HelmSubFlow("THANK_YOU", 10, "m1_thank_you");
    public static final HelmSubFlow UNKNOWN = new HelmSubFlow("UNKNOWN", 11, "unknown");

    private static final /* synthetic */ HelmSubFlow[] $values() {
        return new HelmSubFlow[]{INTRO, BANK_LINKING, GB_QUEUED_DEPOSIT, NATIVE_FUNDING_UPSELL, FIRST_DEPOSIT, RECURRING_DEPOSIT, DOC_UPLOAD, GB_VERIFY_IDENTITY, POST_FUNDING_UPSELL, REFERRAL, THANK_YOU, UNKNOWN};
    }

    public static EnumEntries<HelmSubFlow> getEntries() {
        return $ENTRIES;
    }

    private HelmSubFlow(String str, int i, String str2) {
        this.id = str2;
    }

    public final String getId() {
        return this.id;
    }

    static {
        HelmSubFlow[] helmSubFlowArr$values = $values();
        $VALUES = helmSubFlowArr$values;
        $ENTRIES = EnumEntries2.enumEntries(helmSubFlowArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: HelmSubFlow.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmSubFlow$Companion;", "", "<init>", "()V", "fromId", "Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmSubFlow;", "id", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HelmSubFlow fromId(String id) {
            HelmSubFlow next;
            Intrinsics.checkNotNullParameter(id, "id");
            Iterator<HelmSubFlow> it = HelmSubFlow.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getId(), id)) {
                    break;
                }
            }
            HelmSubFlow helmSubFlow = next;
            if (helmSubFlow != null) {
                return helmSubFlow;
            }
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Subflow " + id + " not found"), true, null, 4, null);
            return HelmSubFlow.UNKNOWN;
        }
    }

    public static HelmSubFlow valueOf(String str) {
        return (HelmSubFlow) Enum.valueOf(HelmSubFlow.class, str);
    }

    public static HelmSubFlow[] values() {
        return (HelmSubFlow[]) $VALUES.clone();
    }
}
