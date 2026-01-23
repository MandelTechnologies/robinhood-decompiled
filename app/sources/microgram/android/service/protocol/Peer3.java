package microgram.android.service.protocol;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import microgram.android.HostMessageDispatcher;
import microgram.service.protocol.Peer;

/* compiled from: Peer.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"peer", "Lmicrogram/service/protocol/Peer;", "Lmicrogram/android/HostMessageDispatcher;", "targetName", "", "json", "Lkotlinx/serialization/json/Json;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.service.protocol.PeerKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Peer3 {
    public static final Peer peer(HostMessageDispatcher hostMessageDispatcher, String targetName, Json json) {
        Intrinsics.checkNotNullParameter(hostMessageDispatcher, "<this>");
        Intrinsics.checkNotNullParameter(targetName, "targetName");
        Intrinsics.checkNotNullParameter(json, "json");
        return new Peer2(hostMessageDispatcher, targetName, json);
    }
}
