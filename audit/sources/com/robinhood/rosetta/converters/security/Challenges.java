package com.robinhood.rosetta.converters.security;

import com.robinhood.models.api.Challenge;
import com.robinhood.rosetta.eventlogging.ChallengeReplacementInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Challenges.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;", "Lcom/robinhood/models/api/Challenge$Type;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.security.ChallengesKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class Challenges {

    /* compiled from: Challenges.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.security.ChallengesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Challenge.Type.values().length];
            try {
                iArr[Challenge.Type.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Challenge.Type.SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Challenge.Type.AUTH_APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Challenge.Type.PROMPTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Challenge.Type.BACKUP_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Challenge.Type.WEBAUTHN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Challenge.Type.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ChallengeReplacementInfo.ChallengeType toProtobuf(Challenge.Type type2) {
        Intrinsics.checkNotNullParameter(type2, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case 1:
                return ChallengeReplacementInfo.ChallengeType.EMAIL;
            case 2:
                return ChallengeReplacementInfo.ChallengeType.SMS;
            case 3:
                return ChallengeReplacementInfo.ChallengeType.APP;
            case 4:
                return ChallengeReplacementInfo.ChallengeType.PROMPT;
            case 5:
                return ChallengeReplacementInfo.ChallengeType.BACKUP_CODE;
            case 6:
                return ChallengeReplacementInfo.ChallengeType.WEBAUTHN;
            case 7:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
