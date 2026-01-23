package com.robinhood.rosetta.converters.brokerage;

import com.robinhood.models.api.ManagementType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.account.ManagementTypeDto;

/* compiled from: ManagementTypes.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0006"}, m3636d2 = {"toProtobuf", "Lrosetta/account/ManagementType;", "Lcom/robinhood/models/api/ManagementType;", "toDto", "Lrosetta/account/ManagementTypeDto;", "toManagementType", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.brokerage.ManagementTypesKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class ManagementTypes2 {

    /* compiled from: ManagementTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.brokerage.ManagementTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ManagementType.values().length];
            try {
                iArr[ManagementType.SELF_DIRECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ManagementType.MANAGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ManagementType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[rosetta.account.ManagementType.values().length];
            try {
                iArr2[rosetta.account.ManagementType.SELF_DIRECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[rosetta.account.ManagementType.MANAGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[rosetta.account.ManagementType.TRADEPMR_MANAGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[rosetta.account.ManagementType.MANAGEMENT_TYPE_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final rosetta.account.ManagementType toProtobuf(ManagementType managementType) {
        Intrinsics.checkNotNullParameter(managementType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[managementType.ordinal()];
        if (i == 1) {
            return rosetta.account.ManagementType.SELF_DIRECTED;
        }
        if (i == 2) {
            return rosetta.account.ManagementType.MANAGED;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return rosetta.account.ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
    }

    public static final ManagementTypeDto toDto(ManagementType managementType) {
        Intrinsics.checkNotNullParameter(managementType, "<this>");
        return ManagementTypeDto.INSTANCE.fromProto(toProtobuf(managementType));
    }

    public static final ManagementType toManagementType(rosetta.account.ManagementType managementType) {
        Intrinsics.checkNotNullParameter(managementType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[managementType.ordinal()];
        if (i == 1) {
            return ManagementType.SELF_DIRECTED;
        }
        if (i == 2) {
            return ManagementType.MANAGED;
        }
        if (i == 3 || i == 4) {
            return ManagementType.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }
}
