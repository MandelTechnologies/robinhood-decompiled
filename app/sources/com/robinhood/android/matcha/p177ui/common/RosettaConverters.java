package com.robinhood.android.matcha.p177ui.common;

import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.P2PContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RosettaConverters.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\bH\u0000\"\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/P2PContext$Direction;", "Lcom/robinhood/android/matcha/ui/models/Direction;", "toAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "toTargetType", "Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType;", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "BaseP2PEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getBaseP2PEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.common.RosettaConvertersKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class RosettaConverters {
    private static final Context BaseP2PEventContext = new Context(0, 0, 0, null, null, null, null, Context.ProductTag.PEER_TO_PEER, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -1, -1, -1, -1, -1, 16383, null);

    /* compiled from: RosettaConverters.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.common.RosettaConvertersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MatchaTransaction.Direction.values().length];
            try {
                iArr2[MatchaTransaction.Direction.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MatchaTransaction.Direction.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final P2PContext.Direction toProtobuf(Direction direction) {
        int i = direction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == -1) {
            return P2PContext.Direction.DIRECTION_UNSPECIFIED;
        }
        if (i == 1) {
            return P2PContext.Direction.PAY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return P2PContext.Direction.REQUEST;
    }

    public static final UserInteractionEventData.Action toAction(MatchaTransaction.Direction direction) {
        Intrinsics.checkNotNullParameter(direction, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[direction.ordinal()];
        if (i == 1) {
            return UserInteractionEventData.Action.PAY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return UserInteractionEventData.Action.REQUEST;
    }

    public static final P2PContext.TargetType toTargetType(Transactor transactor) {
        if (transactor instanceof Transactor.Email) {
            return ((Transactor.Email) transactor).getIsContact() ? P2PContext.TargetType.CONTACT_EMAIL : P2PContext.TargetType.OFF_NETWORK_EMAIL;
        }
        if (transactor instanceof Transactor.Phone) {
            return ((Transactor.Phone) transactor).getIsContact() ? P2PContext.TargetType.CONTACT_PHONE : P2PContext.TargetType.OFF_NETWORK_PHONE;
        }
        if (transactor instanceof Transactor.User) {
            return ((Transactor.User) transactor).isConnection() ? P2PContext.TargetType.CONNECTION : P2PContext.TargetType.RH_USER;
        }
        if (transactor != null) {
            throw new NoWhenBranchMatchedException();
        }
        return P2PContext.TargetType.TARGET_TYPE_UNSPECIFIED;
    }

    public static final Context getBaseP2PEventContext() {
        return BaseP2PEventContext;
    }
}
