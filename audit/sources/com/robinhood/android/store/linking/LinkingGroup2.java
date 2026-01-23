package com.robinhood.android.store.linking;

import hippo.model.p469v1.LinkingGroupDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkingGroup.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toDbModel", "Lcom/robinhood/android/store/linking/LinkingGroup;", "Lhippo/model/v1/LinkingGroupDto;", "lib-store-mobile-linking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.store.linking.LinkingGroupKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class LinkingGroup2 {
    public static final LinkingGroup toDbModel(LinkingGroupDto linkingGroupDto) {
        Intrinsics.checkNotNullParameter(linkingGroupDto, "<this>");
        return new LinkingGroup(linkingGroupDto.getId(), linkingGroupDto.is_linked(), linkingGroupDto.getColor(), linkingGroupDto.getInstrument_id(), linkingGroupDto.getInstrument_type(), linkingGroupDto.getInstrument_symbol(), linkingGroupDto.getWidget_ids());
    }
}
