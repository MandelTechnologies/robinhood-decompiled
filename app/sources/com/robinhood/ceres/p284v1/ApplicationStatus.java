package com.robinhood.ceres.p284v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApplicationStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ApplicationStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "APPLICATION_STATUS_UNSPECIFIED", "APPLICATION_STATUS_NEW", "APPLICATION_STATUS_IN_PROGRESS", "APPLICATION_STATUS_APPROVED", "APPLICATION_STATUS_REJECTED", "APPLICATION_STATUS_CHECKPOINT_IN_PROGRESS", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ApplicationStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ApplicationStatus[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ApplicationStatus> ADAPTER;
    public static final ApplicationStatus APPLICATION_STATUS_APPROVED;
    public static final ApplicationStatus APPLICATION_STATUS_CHECKPOINT_IN_PROGRESS;
    public static final ApplicationStatus APPLICATION_STATUS_IN_PROGRESS;
    public static final ApplicationStatus APPLICATION_STATUS_NEW;
    public static final ApplicationStatus APPLICATION_STATUS_REJECTED;
    public static final ApplicationStatus APPLICATION_STATUS_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ ApplicationStatus[] $values() {
        return new ApplicationStatus[]{APPLICATION_STATUS_UNSPECIFIED, APPLICATION_STATUS_NEW, APPLICATION_STATUS_IN_PROGRESS, APPLICATION_STATUS_APPROVED, APPLICATION_STATUS_REJECTED, APPLICATION_STATUS_CHECKPOINT_IN_PROGRESS};
    }

    @JvmStatic
    public static final ApplicationStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ApplicationStatus> getEntries() {
        return $ENTRIES;
    }

    private ApplicationStatus(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ApplicationStatus applicationStatus = new ApplicationStatus("APPLICATION_STATUS_UNSPECIFIED", 0, 0);
        APPLICATION_STATUS_UNSPECIFIED = applicationStatus;
        APPLICATION_STATUS_NEW = new ApplicationStatus("APPLICATION_STATUS_NEW", 1, 1);
        APPLICATION_STATUS_IN_PROGRESS = new ApplicationStatus("APPLICATION_STATUS_IN_PROGRESS", 2, 2);
        APPLICATION_STATUS_APPROVED = new ApplicationStatus("APPLICATION_STATUS_APPROVED", 3, 3);
        APPLICATION_STATUS_REJECTED = new ApplicationStatus("APPLICATION_STATUS_REJECTED", 4, 4);
        APPLICATION_STATUS_CHECKPOINT_IN_PROGRESS = new ApplicationStatus("APPLICATION_STATUS_CHECKPOINT_IN_PROGRESS", 5, 5);
        ApplicationStatus[] applicationStatusArr$values = $values();
        $VALUES = applicationStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(applicationStatusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ApplicationStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ApplicationStatus>(orCreateKotlinClass, syntax, applicationStatus) { // from class: com.robinhood.ceres.v1.ApplicationStatus$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ApplicationStatus fromValue(int value) {
                return ApplicationStatus.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ApplicationStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ApplicationStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/ApplicationStatus;", "fromValue", "value", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ApplicationStatus fromValue(int value) {
            if (value == 0) {
                return ApplicationStatus.APPLICATION_STATUS_UNSPECIFIED;
            }
            if (value == 1) {
                return ApplicationStatus.APPLICATION_STATUS_NEW;
            }
            if (value == 2) {
                return ApplicationStatus.APPLICATION_STATUS_IN_PROGRESS;
            }
            if (value == 3) {
                return ApplicationStatus.APPLICATION_STATUS_APPROVED;
            }
            if (value == 4) {
                return ApplicationStatus.APPLICATION_STATUS_REJECTED;
            }
            if (value != 5) {
                return null;
            }
            return ApplicationStatus.APPLICATION_STATUS_CHECKPOINT_IN_PROGRESS;
        }
    }

    public static ApplicationStatus valueOf(String str) {
        return (ApplicationStatus) Enum.valueOf(ApplicationStatus.class, str);
    }

    public static ApplicationStatus[] values() {
        return (ApplicationStatus[]) $VALUES.clone();
    }
}
