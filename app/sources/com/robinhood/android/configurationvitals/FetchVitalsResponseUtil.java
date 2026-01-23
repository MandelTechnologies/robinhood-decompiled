package com.robinhood.android.configurationvitals;

import bff_vitals.service.p021v1.FetchVitalsResponseDto;
import com.robinhood.models.api.UnsupportedVersionContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FetchVitalsResponseUtil.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toUnsupportedVersionContent", "Lcom/robinhood/models/api/UnsupportedVersionContent;", "Lbff_vitals/service/v1/FetchVitalsResponseDto;", "lib-configuration-vitals_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.configurationvitals.FetchVitalsResponseUtilKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class FetchVitalsResponseUtil {
    public static final UnsupportedVersionContent toUnsupportedVersionContent(FetchVitalsResponseDto fetchVitalsResponseDto) {
        UnsupportedVersionContent.Button.Action unknown;
        Intrinsics.checkNotNullParameter(fetchVitalsResponseDto, "<this>");
        FetchVitalsResponseDto.UnsupportedVersionContentDto unsupported_version_content = fetchVitalsResponseDto.getUnsupported_version_content();
        if (unsupported_version_content == null) {
            return null;
        }
        String message_title = unsupported_version_content.getMessage_title();
        String message_body_markdown = unsupported_version_content.getMessage_body_markdown();
        List<FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto> buttons = unsupported_version_content.getButtons();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
        for (FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto buttonDto : buttons) {
            String label = buttonDto.getLabel();
            boolean zIs_primary = buttonDto.is_primary();
            FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.ActionDto action = buttonDto.getAction();
            FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.ActionDto.ConcreteDto concrete = action != null ? action.getConcrete() : null;
            if (concrete instanceof FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.ActionDto.ConcreteDto.Url) {
                unknown = new UnsupportedVersionContent.Button.Action.Url(((FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.ActionDto.ConcreteDto.Url) concrete).getValue());
            } else if (concrete instanceof FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.ActionDto.ConcreteDto.CancelAction) {
                unknown = new UnsupportedVersionContent.Button.Action.Cancel(0, 1, null);
            } else if (concrete instanceof FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.ActionDto.ConcreteDto.OpenAppStoreAction) {
                unknown = new UnsupportedVersionContent.Button.Action.OpenPlayStore(0, 1, null);
            } else if (concrete instanceof FetchVitalsResponseDto.UnsupportedVersionContentDto.ButtonDto.ActionDto.ConcreteDto.DismissAction) {
                unknown = new UnsupportedVersionContent.Button.Action.Dismiss(0, 1, null);
            } else {
                if (concrete != null) {
                    throw new NoWhenBranchMatchedException();
                }
                unknown = new UnsupportedVersionContent.Button.Action.Unknown(0, 1, null);
            }
            arrayList.add(new UnsupportedVersionContent.Button(label, zIs_primary, unknown));
        }
        return new UnsupportedVersionContent(message_title, message_body_markdown, arrayList);
    }
}
