package com.withpersona.sdk2.inquiry.document.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

/* compiled from: DocumentService.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\fJ.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H§@¢\u0006\u0002\u0010\u0012J&\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\fJ0\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentService;", "", "createDocument", "Lretrofit2/Response;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "sessionToken", "", "request", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadDocuments", "documentId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addFile", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "document", "", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFile", "fileId", "submitDocument", "inquiryId", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface DocumentService {
    @Headers({"Accept: multipart/form-data"})
    @POST("/api/internal/verify/v1/document-files")
    @Multipart
    Object addFile(@Header("Authorization") String str, @Part List<MultipartBody.Part> list, Continuation<? super Response<DocumentFileUploadResponse>> continuation);

    @POST("/api/internal/verify/v1/documents")
    Object createDocument(@Header("Authorization") String str, @Body CreateDocumentRequest createDocumentRequest, Continuation<? super Response<CreateDocumentResponse>> continuation);

    @DELETE("/api/internal/verify/v1/document-files/{fileId}")
    Object deleteFile(@Header("Authorization") String str, @Path("fileId") String str2, Continuation<? super Response<?>> continuation);

    @GET("/api/internal/verify/v1/documents/{documentId}")
    Object loadDocuments(@Header("Authorization") String str, @Path("documentId") String str2, Continuation<? super Response<CreateDocumentResponse>> continuation);

    @POST("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    Object submitDocument(@Header("Authorization") String str, @Path("inquiryId") String str2, @Body SubmitDocumentRequest submitDocumentRequest, Continuation<? super Response<?>> continuation);
}
