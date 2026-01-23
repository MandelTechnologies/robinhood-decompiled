package com.robinhood.android.cortex.contracts;

import bonfire.proto.idl.copilot.p032v1.FlowTypeDto;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AssetDigestOnboardingFlowType.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cortex/contracts/AssetDigestOnboardingFlowType;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", EducationTourScreenNames.UNSPECIFIED_SCREEN, "SDP_ARROW_UPSELL", "toCopilotOnboardingRequestFlowType", "Lbonfire/proto/idl/copilot/v1/FlowTypeDto;", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AssetDigestOnboardingFlowType implements RhEnum<AssetDigestOnboardingFlowType> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetDigestOnboardingFlowType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final AssetDigestOnboardingFlowType UNSPECIFIED = new AssetDigestOnboardingFlowType(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, "unspecified");
    public static final AssetDigestOnboardingFlowType SDP_ARROW_UPSELL = new AssetDigestOnboardingFlowType("SDP_ARROW_UPSELL", 1, "sdp_arrow_upsell");

    /* compiled from: AssetDigestOnboardingFlowType.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetDigestOnboardingFlowType.values().length];
            try {
                iArr[AssetDigestOnboardingFlowType.SDP_ARROW_UPSELL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ AssetDigestOnboardingFlowType[] $values() {
        return new AssetDigestOnboardingFlowType[]{UNSPECIFIED, SDP_ARROW_UPSELL};
    }

    public static EnumEntries<AssetDigestOnboardingFlowType> getEntries() {
        return $ENTRIES;
    }

    private AssetDigestOnboardingFlowType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        AssetDigestOnboardingFlowType[] assetDigestOnboardingFlowTypeArr$values = $values();
        $VALUES = assetDigestOnboardingFlowTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetDigestOnboardingFlowTypeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: AssetDigestOnboardingFlowType.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/cortex/contracts/AssetDigestOnboardingFlowType$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/android/cortex/contracts/AssetDigestOnboardingFlowType;", "<init>", "()V", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion extends RhEnum.Converter.Defaulted<AssetDigestOnboardingFlowType> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super((Enum[]) AssetDigestOnboardingFlowType.getEntries().toArray(new AssetDigestOnboardingFlowType[0]), AssetDigestOnboardingFlowType.UNSPECIFIED, false, 4, null);
        }
    }

    public final FlowTypeDto toCopilotOnboardingRequestFlowType() {
        if (WhenMappings.$EnumSwitchMapping$0[ordinal()] == 1) {
            return FlowTypeDto.SDP_ARROW_UPSELL;
        }
        return FlowTypeDto.TYPE_UNSPECIFIED;
    }

    public static AssetDigestOnboardingFlowType valueOf(String str) {
        return (AssetDigestOnboardingFlowType) Enum.valueOf(AssetDigestOnboardingFlowType.class, str);
    }

    public static AssetDigestOnboardingFlowType[] values() {
        return (AssetDigestOnboardingFlowType[]) $VALUES.clone();
    }
}
