package com.robinhood.rosetta.converters.engagement;

import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.rosetta.eventlogging.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Lists.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/List$OwnerType;", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.engagement.ListsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class Lists3 {

    /* compiled from: Lists.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.engagement.ListsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCuratedList.OwnerType.values().length];
            try {
                iArr[ApiCuratedList.OwnerType.ROBINHOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCuratedList.OwnerType.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCuratedList.OwnerType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List.OwnerType toProtobuf(ApiCuratedList.OwnerType ownerType) {
        Intrinsics.checkNotNullParameter(ownerType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[ownerType.ordinal()];
        if (i == 1) {
            return List.OwnerType.ROBINHOOD;
        }
        if (i == 2) {
            return List.OwnerType.USER;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return List.OwnerType.OWNER_TYPE_UNSPECIFIED;
    }
}
