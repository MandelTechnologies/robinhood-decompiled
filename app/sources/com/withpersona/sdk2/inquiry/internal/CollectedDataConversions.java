package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.network.DocumentStepData;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdDetails;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdStepData;
import com.withpersona.sdk2.inquiry.p424ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.p424ui.network.ComponentParam2;
import com.withpersona.sdk2.inquiry.p424ui.network.UiStepData;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.network.SelfieStepData;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import com.withpersona.sdk2.inquiry.types.collected_data.CollectedData;
import com.withpersona.sdk2.inquiry.types.collected_data.CollectedGovernmentIdDetails;
import com.withpersona.sdk2.inquiry.types.collected_data.DocumentFile;
import com.withpersona.sdk2.inquiry.types.collected_data.GovernmentIdCapture;
import com.withpersona.sdk2.inquiry.types.collected_data.SelfieCapture;
import com.withpersona.sdk2.inquiry.types.collected_data.StepData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CollectedDataConversions.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0003\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0007H\u0002\u001a\f\u0010\b\u001a\u00020\u0005*\u00020\tH\u0002\u001a\u0014\u0010\n\u001a\u00020\u000b*\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002H\u0002\u001a\f\u0010\n\u001a\u00020\r*\u00020\u000eH\u0002\u001a\f\u0010\u000f\u001a\u00020\u0005*\u00020\u0010H\u0002\u001a\u000e\u0010\n\u001a\u0004\u0018\u00010\u0011*\u00020\u0012H\u0002\u001a\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0014¨\u0006\u0015"}, m3636d2 = {"toCollectedData", "Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedData;", "", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "toStepData", "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "toDocumentStepData", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentStepData;", "toGovernmentIdStepData", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdStepData;", "to", "Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedGovernmentIdDetails;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "toSelfieStepData", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfieStepData;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "toUiStepData", "Lcom/withpersona/sdk2/inquiry/ui/network/UiStepData;", "inquiry-internal_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.internal.CollectedDataConversionsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class CollectedDataConversions {

    /* compiled from: CollectedDataConversions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.internal.CollectedDataConversionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[GovernmentId.Side.values().length];
            try {
                iArr[GovernmentId.Side.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GovernmentId.Side.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GovernmentId.Side.FRONT_AND_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GovernmentId.CaptureMethod.values().length];
            try {
                iArr2[GovernmentId.CaptureMethod.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GovernmentId.CaptureMethod.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GovernmentId.CaptureMethod.UPLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Selfie.CaptureMethod.values().length];
            try {
                iArr3[Selfie.CaptureMethod.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Selfie.CaptureMethod.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final CollectedData toCollectedData(List<? extends StepData> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.withpersona.sdk2.inquiry.types.collected_data.StepData stepData = toStepData((StepData) it.next());
            if (stepData != null) {
                arrayList.add(stepData);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new CollectedData(arrayList);
    }

    public static final com.withpersona.sdk2.inquiry.types.collected_data.StepData toStepData(StepData stepData) {
        Intrinsics.checkNotNullParameter(stepData, "<this>");
        if (stepData instanceof UiStepData) {
            return toUiStepData((UiStepData) stepData);
        }
        if (stepData instanceof SelfieStepData) {
            return toSelfieStepData((SelfieStepData) stepData);
        }
        if (stepData instanceof GovernmentIdStepData) {
            return toGovernmentIdStepData((GovernmentIdStepData) stepData);
        }
        if (stepData instanceof DocumentStepData) {
            return toDocumentStepData((DocumentStepData) stepData);
        }
        return null;
    }

    private static final com.withpersona.sdk2.inquiry.types.collected_data.StepData toDocumentStepData(DocumentStepData documentStepData) {
        DocumentFile documentFile;
        String stepName = documentStepData.getStepName();
        List<com.withpersona.sdk2.inquiry.document.DocumentFile> documents = documentStepData.getDocuments();
        ArrayList arrayList = new ArrayList();
        for (com.withpersona.sdk2.inquiry.document.DocumentFile documentFile2 : documents) {
            if (documentFile2 instanceof DocumentFile.Local) {
                documentFile = new com.withpersona.sdk2.inquiry.types.collected_data.DocumentFile(new File(((DocumentFile.Local) documentFile2).getAbsoluteFilePath()));
            } else {
                if (!(documentFile2 instanceof DocumentFile.Remote)) {
                    throw new NoWhenBranchMatchedException();
                }
                String absoluteFilePath = ((DocumentFile.Remote) documentFile2).getAbsoluteFilePath();
                documentFile = absoluteFilePath != null ? new com.withpersona.sdk2.inquiry.types.collected_data.DocumentFile(new File(absoluteFilePath)) : null;
            }
            if (documentFile != null) {
                arrayList.add(documentFile);
            }
        }
        return new StepData.DocumentStepData(stepName, arrayList);
    }

    private static final com.withpersona.sdk2.inquiry.types.collected_data.StepData toGovernmentIdStepData(GovernmentIdStepData governmentIdStepData) {
        String stepName = governmentIdStepData.getStepName();
        List<GovernmentId> ids = governmentIdStepData.getIds();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(ids, 10));
        Iterator<T> it = ids.iterator();
        while (it.hasNext()) {
            arrayList.add(m3224to((GovernmentId) it.next()));
        }
        List<GovernmentId> ids2 = governmentIdStepData.getIds();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : ids2) {
            if (obj instanceof GovernmentId.GovernmentIdImage) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((GovernmentId.GovernmentIdImage) it2.next()).getIdDetails());
        }
        return new StepData.GovernmentIdStepData(stepName, arrayList, m3223to(arrayList3));
    }

    /* renamed from: to */
    private static final CollectedGovernmentIdDetails m3223to(List<GovernmentIdDetails> list) {
        Iterator<GovernmentIdDetails> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                GovernmentIdDetails next = it.next();
                if ((next != null ? next.getDateOfBirth() : null) != null && next.getExpirationDate() != null) {
                    return new CollectedGovernmentIdDetails(next.getDateOfBirth(), next.getExpirationDate());
                }
            } else {
                return new CollectedGovernmentIdDetails(null, null);
            }
        }
    }

    /* renamed from: to */
    private static final GovernmentIdCapture m3224to(GovernmentId governmentId) {
        GovernmentIdCapture.Side side;
        GovernmentIdCapture.CaptureMethod captureMethod;
        String idClassKey = governmentId.getIdClassKey();
        int i = WhenMappings.$EnumSwitchMapping$0[governmentId.getSide().ordinal()];
        if (i == 1) {
            side = GovernmentIdCapture.Side.Front;
        } else if (i == 2) {
            side = GovernmentIdCapture.Side.Back;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            side = GovernmentIdCapture.Side.FrontAndBack;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[governmentId.getCaptureMethod().ordinal()];
        if (i2 == 1) {
            captureMethod = GovernmentIdCapture.CaptureMethod.Auto;
        } else if (i2 == 2) {
            captureMethod = GovernmentIdCapture.CaptureMethod.Manual;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            captureMethod = GovernmentIdCapture.CaptureMethod.Upload;
        }
        List<Frame> frames = governmentId.getFrames();
        ArrayList arrayList = new ArrayList();
        for (Frame frame : frames) {
            File file = new File(frame.getAbsoluteFilePath());
            GovernmentIdCapture.Frame frame2 = file.exists() ? new GovernmentIdCapture.Frame(file, frame.getMimeType()) : null;
            if (frame2 != null) {
                arrayList.add(frame2);
            }
        }
        return new GovernmentIdCapture(idClassKey, side, captureMethod, arrayList);
    }

    private static final com.withpersona.sdk2.inquiry.types.collected_data.StepData toSelfieStepData(SelfieStepData selfieStepData) {
        String stepName = selfieStepData.getStepName();
        Selfie centerCapture = selfieStepData.getCenterCapture();
        SelfieCapture selfieCaptureM3225to = centerCapture != null ? m3225to(centerCapture) : null;
        Selfie centerCapture2 = selfieStepData.getCenterCapture();
        SelfieCapture selfieCaptureM3225to2 = centerCapture2 != null ? m3225to(centerCapture2) : null;
        Selfie centerCapture3 = selfieStepData.getCenterCapture();
        return new StepData.SelfieStepData(stepName, selfieCaptureM3225to, selfieCaptureM3225to2, centerCapture3 != null ? m3225to(centerCapture3) : null);
    }

    /* renamed from: to */
    private static final SelfieCapture m3225to(Selfie selfie) {
        SelfieCapture.CaptureMethod captureMethod;
        if (!new File(selfie.getAbsoluteFilePath()).exists()) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$2[selfie.getCaptureMethod().ordinal()];
        if (i == 1) {
            captureMethod = SelfieCapture.CaptureMethod.Auto;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            captureMethod = SelfieCapture.CaptureMethod.Manual;
        }
        return new SelfieCapture(captureMethod, new File(selfie.getAbsoluteFilePath()));
    }

    public static final com.withpersona.sdk2.inquiry.types.collected_data.StepData toUiStepData(UiStepData uiStepData) {
        Intrinsics.checkNotNullParameter(uiStepData, "<this>");
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = uiStepData.getComponentParams().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            try {
                Object value = ComponentParam2.toValue((ComponentParam) entry.getValue());
                parcelObtain.writeValue(value);
                linkedHashMap.put(str, value);
            } catch (RuntimeException unused) {
            }
        }
        parcelObtain.recycle();
        return new StepData.UiStepData(uiStepData.getStepName(), linkedHashMap);
    }
}
